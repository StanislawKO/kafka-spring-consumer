package com.example.kafkaspringconsumer.service;


import com.example.kafkaspringconsumer.model.StringValue;

import java.util.List;

public interface StringValueConsumer {

    void accept(List<StringValue> value);
}