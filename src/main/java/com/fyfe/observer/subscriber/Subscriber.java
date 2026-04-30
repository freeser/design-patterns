package com.fyfe.observer.subscriber;

import java.util.Map;

public interface Subscriber {
    void onEvent(Map<String, Object> eventContext);
}