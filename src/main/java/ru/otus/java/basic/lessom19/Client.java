package ru.otus.java.basic.lessom19;

import java.io.*;

public class Client {
    private DataInputStream in;
    private DataOutputStream out;

    public Client(InputStream in, OutputStream out) {
        this.in = new DataInputStream(new BufferedInputStream(in));
        this.out = new DataOutputStream(new BufferedOutputStream(out));
    }
    public void ping(byte[] bytes) throws IOException {
        out.write(bytes);
        out.flush();

    }
    public 
}
