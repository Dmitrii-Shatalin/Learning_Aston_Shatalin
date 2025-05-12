interface SecretDocument {
    void displayContent();
}

class ClassifiedDocument implements SecretDocument {
    private String content;

    public ClassifiedDocument(String content) {
        System.out.println("Загрузка секретного документа с сервера...");
        this.content = content;
    }

    public void displayContent() {
        System.out.println("Содержимое документа: " + content);
    }
}

class DocumentProxy implements SecretDocument {
    private ClassifiedDocument realDocument;
    private String content;
    private String userRole;

    public DocumentProxy(String content, String userRole) {
        this.content = content;
        this.userRole = userRole;
    }

    public void displayContent() {
        if (checkAccess()) {
            if (realDocument == null) {
                realDocument = new ClassifiedDocument(content);
            }
            realDocument.displayContent();
        } else {
            System.out.println("Отказано в доступе! Недостаточно прав.");
        }
    }

    private boolean checkAccess() {
        return userRole.equals("admin");
    }
}