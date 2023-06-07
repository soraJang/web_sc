package com.web_sc.vo;

public class SocketVO {
    private String roomId;

    // 유저의 이름을 저장하기 위한 변수
    private String userName;

    // 메시지의 내용을 저장하기 위한 변수
    private String content;
    private String from;

    public SocketVO(String roomId, String userName, String content, String from) {
        this.roomId = roomId;
        this.userName = userName;
        this.content = content;
        this.from = from;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public String toString() {
        return "SocketVO{" +
                "roomId='" + roomId + '\'' +
                ", userName='" + userName + '\'' +
                ", content='" + content + '\'' +
                ", from='" + from + '\'' +
                '}';
    }
}
