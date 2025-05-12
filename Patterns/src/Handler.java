abstract class Handler {
    private Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    protected void checkNext(String request) {
        if (next != null) next.handle(request);
    }

    public abstract void handle(String request);
}

class AuthHandler extends Handler {
    public void handle(String request) {
        if (request.contains("auth_token")) {
            System.out.println("Авторизация успешна");
        } else {
            System.out.println("Ошибка авторизации!");
        }
        checkNext(request);
    }
}

class LogHandler extends Handler {
    public void handle(String request) {
        System.out.println("Логирование запроса: " + request);
        checkNext(request);
    }
}