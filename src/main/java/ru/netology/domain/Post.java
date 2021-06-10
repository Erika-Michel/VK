package ru.netology.domain;

public class Post {
    private String id; // идентификатор поста
    private String postUrl; // ссылка на пост мб?
    private String date;
    private String time;
    private String authorId; // автор поста (должно подтягивать имя и аватар)
    private String text;
    private int maxTextLength;
    private int previewTextLength;
    private String mediaUrl; //Медиаматериал (изображение, видео, ссылка)
    private int viewsQuantity;
    private Like like;
    private Comment comment;
    private Repost repost;

    // + getters/setters
}
