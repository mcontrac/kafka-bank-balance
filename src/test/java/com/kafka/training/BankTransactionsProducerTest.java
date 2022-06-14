package com.kafka.training;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class BankTransactionsProducerTest {

    @Test
    public void NewRandomTransactionTest(){
        ProducerRecord<String, String> record = BankTransactionsProducer.newRandomTransaction("john");
        String key = record.key();
        String value = record.value();

        assertEquals(key, "john");

        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode node = mapper.readTree(value);
            assertEquals();

        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        System.out.println(value);
    }
}