package com.usjr.finalsexam;

import com.usjr.finalsexam.entity.Video;

import java.util.ArrayList;

/**
 * Created by Eugene Boholst on 10/12/2016.
 */

public interface VideoListPresenter {
    void ItemsOnFirebase(ArrayList<Video> videos);
}
