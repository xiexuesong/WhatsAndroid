package com.haiyunshan.whatsnote.article.dataset;

import club.andnext.dataset.BaseEntry;
import com.google.gson.annotations.SerializedName;

public abstract class ArticleEntry extends BaseEntry {

    @SerializedName("type")
    String type;

    public ArticleEntry(String id, String type) {
        this.id = id;
        this.type = type;
    }
}
