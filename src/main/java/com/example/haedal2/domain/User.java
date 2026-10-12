package com.example.haedal2.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity  // 속성 부여 ( 어노테이션 )
@NoArgsConstructor
@Getter
@Setter

public class User {

    @Id // Entity는 id 필드 필요
    @GeneratedValue(strategy = GenerationType.AUTO)  // id값 자동생성
    private long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @Column(length = 500)
    private String bio;

    @Column(name = "joined_at", nullable = false) // 실제 db 저장명
    private LocalDateTime joinedAt;

    @Column(name = "image_url")
    private String imageUrl;

    //    @OneToMany(mappedBy = "user")
    //    private List<Post> posts;
    //
    //    @OneToMany(mappedBy = "user")
    //    private List<Like> likes;
    //
    //    @OneToMany(mappedBy = "follower")
    //    private List<Follow> followings;
    //
    //    @OneToMany(mappedBy = "following")
    //    private List<Follow> followers;

    // 생성자
    public User(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.bio = null;
        this.joinedAt = LocalDateTime.now();
        this.imageUrl = null;
    }

}
