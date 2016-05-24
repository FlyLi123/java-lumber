package org.logstash.beats;

import java.util.Map;

public class Message implements Comparable<Message> {
    private int sequence;
    private String identityStream;
    private Map data;
    private Payload payload;

    public Message(Payload payload, int sequence, Map map) {
        setPayload(payload);
        setSequence(sequence);
        setData(map);
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getIdentityStream() {
        return identityStream;
    }

    public void setIdentityStream(String identityStream) {
        this.identityStream = identityStream;
    }

    public Map getData() {
        return data;
    }

    public void setData(Map data) {
        this.data = data;
    }

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    @Override
    public int compareTo(Message o) {
        return Integer.compare(this.getSequence(), o.getSequence());
    }
}