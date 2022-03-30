public class TelegramMessager implements Messager{
    @Override
    public void call(String phoneNumber) {
        System.out.println("Telegram начал исходящий вызов");
        System.out.println("происходит логирование данных");
        System.out.println("отправляется запрос на сервер с ip 15223555");
        System.out.println("если получили полож ответ, то звучат гудки");
    }

    @Override
    public void sendMessage(String phoneNumber, String message) {

    }
}
