package pino.code.little;

public class AssignmentTwo {
    interface Logger {
        public void write(String log);
    }

    static class Log2Screen implements Logger {

        @Override
        public void write(String log) {
            System.out.println("In content ra man hinh: " + log);
        }
    }

    static class Log2Email implements Logger {

        @Override
        public void write(String log) {
            System.out.println("Gui content vao email: " + log);
        }
    }

    static class Log2File implements Logger {

        @Override
        public void write(String log) {
            System.out.println("In content vao file: " + log);
        }
    }

    public static void main(String[] args) {
        Log2Screen screenLogger = new Log2Screen();
        screenLogger.write("Hi");
        Log2Email emailLogger = new Log2Email();
        emailLogger.write("Hello");
        Log2File fileLogger = new Log2File();
        fileLogger.write("Hey");
    }


}

