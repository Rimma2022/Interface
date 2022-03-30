public interface Messager {
    void call(String phoneNumber);
    void sendMessage (String phoneNumber, String message);
    default void createChat(String chatName) {
        System.out.println("Создан чат с именем " + chatName );
    }

}
