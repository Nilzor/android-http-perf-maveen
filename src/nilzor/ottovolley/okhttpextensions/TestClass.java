package nilzor.ottovolley.okhttpextensions;

import okio.Buffer;
import okio.Sink;
import okio.Timeout;

import java.io.IOException;

/**
 * Created by Frode on 31.05.2014.
 */
public class TestClass implements Sink {
    @Override
    public void write(Buffer buffer, long l) throws IOException {

    }

    @Override
    public void flush() throws IOException {

    }

    @Override
    public Timeout timeout() {
        return null;
    }

    @Override
    public void close() throws IOException {

    }
}
