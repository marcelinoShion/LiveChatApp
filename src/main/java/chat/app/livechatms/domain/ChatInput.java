package chat.app.livechatms.domain;

public class ChatInput{
    String user ;
    String message;
    public ChatInput(String user , String message){
        this.user = user;
        this.message = message;
    }

    public String getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }
}