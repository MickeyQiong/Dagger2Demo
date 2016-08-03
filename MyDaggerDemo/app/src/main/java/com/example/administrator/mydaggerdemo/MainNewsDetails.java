package com.example.administrator.mydaggerdemo;

import android.os.Parcel;
import android.os.Parcelable;

import com.bluelinelabs.logansquare.LoganSquare;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.util.List;

/**
 * Description :新闻条目的详情信息，包含了图片，标题，点赞...
 * Email  : bigbigpeng3@gmail.com
 * Author : peng zhang
 * Date   : 2016-3-10
 */
@JsonObject
public class MainNewsDetails {

    @JsonField
    public String message;
    @JsonField
    public int status;
    @JsonField
    public DataEntity data;

    @Override
    public String toString() {
        return "MainNewsDetails{" +
                "message='" + message + '\'' +
                ", status=" + status +
                ", data=" + data +
                '}';
    }

    @JsonObject
    public static class DataEntity {

        @JsonField
        public int totalPage;

        @JsonField
        public List<NewsData> article_list;

        @Override
        public String toString() {
            return "DataEntity{" +
                    "totalpage='" + totalPage + '\'' +
                    ", article_list=" + article_list +
                    '}';
        }

        @JsonObject
        public static class NewsData {

            @JsonField
            public String id;
            @JsonField
            public String title;
            @JsonField
            public String inputtime;
            @JsonField
            public String url;
            @JsonField
            public int channelid;
            @JsonField
            public int share_num;
            @JsonField
            public int click_num;
            @JsonField
            public int img_count;

            @JsonField
            public List<String> mark;
            @JsonField
            public List<String> content;

            @JsonField
            public DetailBean detail;


            @JsonObject
            public static class DetailBean {
                @JsonField
                public String labelid;
                @JsonField
                public String title;
                @JsonField
                public String label_attr; //不是 3  就是频道  是3 就是计划
                @JsonField
                public String add_num;
                @JsonField
                public String small_thumb;
                @JsonField
                public String isstart;
                @JsonField
                public String favorites;//是否收藏了 0 1

                @Override
                public String toString() {
                    return "DetailBean{" +
                            "labelid='" + labelid + '\'' +
                            ", title='" + title + '\'' +
                            ", label_attr='" + label_attr + '\'' +
                            ", add_num='" + add_num + '\'' +
                            ", small_thumb='" + small_thumb + '\'' +
                            ", isstart='" + isstart + '\'' +
                            ", favorites='" + favorites + '\'' +
                            '}';
                }
            }

            @Override
            public String toString() {
                return "NewsData{" +
                        "id=" + id +
                        ", title='" + title + '\'' +
                        ", inputtime='" + inputtime + '\'' +
                        ", url='" + url + '\'' +
                        ", channelid=" + channelid +
                        ", share_num=" + share_num +
                        ", click_num=" + click_num +
                        ", img_count=" + img_count +
                        ", mark=" + mark +
                        ", content=" + content +
                        ", detail=" + detail +
                        '}';
            }
        }
    }
}
