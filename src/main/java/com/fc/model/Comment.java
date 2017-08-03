package com.fc.model;
public class Comment {

    private Integer cid;
    
    //评论区某人的在评论，在某一条回复下的评论。
    private Integer fid;
    
    private String fromUsername;

    //评论内容
    private String content;
    //两个外键，指向Reply和User
    private Reply reply;
    private User user;

    //评论时间
    private String commentTime;

    public Comment() {}

    public String getFromUsername() {
		return fromUsername;
	}

	public void setFromUsername(String fromUsername) {
		this.fromUsername = fromUsername;
	}

	public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getFid() {
		return fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Reply getReply() {
        return reply;
    }

    public void setReply(Reply reply) {
        this.reply = reply;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }

	@Override
	public String toString() {
		return "Comment [cid=" + cid + ", fid=" + fid + ", fromUsername="
				+ fromUsername + ", content=" + content + ", reply=" + reply
				+ ", user=" + user + ", commentTime=" + commentTime + "]";
	}


}
