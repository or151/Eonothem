package com.sample;

import org.drools.KnowledgeBase;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.runtime.process.ProcessInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This is a sample file to launch a process.
 */
public class ProcessMain {
	
	private static Logger logger = LoggerFactory.getLogger(ProcessMain.class);

	public static final void main(String[] args) throws Exception {
		logger.info("main");
		// load up the knowledge base
		KnowledgeBase kbase = readKnowledgeBase();
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		logger.info(ksession.toString());
		// start a new process instance
		ProcessInstance process = ksession.startProcess("com.sample.bpmn.hello");
		Thread.sleep(3000);
		ksession.signalEvent("Type", "Type", process.getId());
	}

	private static KnowledgeBase readKnowledgeBase() throws Exception {
		KnowledgeBuilder knowledgeBuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		knowledgeBuilder.add(ResourceFactory.newClassPathResource("sample.bpmn"), ResourceType.BPMN2);
		return knowledgeBuilder.newKnowledgeBase();
	}
	
}