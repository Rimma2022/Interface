public class ViberMessager implements Messager, VideoCall{

    @Override
    public void call(String phoneNumber) {
        System.out.println("Viber начал исходящий вызов");
        System.out.println("проверяем регион клиента");
        System.out.println("если клиент не входит список 1, то звучат гудки");
    }

    @Override
    public void sendMessage(String phoneNumber, String message) {

    }

    @Override
    public void videoCall(String phoneNumber) {

    }
}
