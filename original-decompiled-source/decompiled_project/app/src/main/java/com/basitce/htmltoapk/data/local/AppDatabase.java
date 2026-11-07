package com.basitce.htmltoapk.data.local;

import androidx.room.g0;
import com.basitce.htmltoapk.data.local.dao.FolderDao;
import com.basitce.htmltoapk.data.local.dao.KeystoreDao;
import com.basitce.htmltoapk.data.local.dao.ProjectDao;

/* loaded from: classes.dex */
public abstract class AppDatabase extends g0 {
    public static final int $stable = 0;

    public abstract FolderDao folderDao();

    public abstract KeystoreDao keystoreDao();

    public abstract ProjectDao projectDao();
}
