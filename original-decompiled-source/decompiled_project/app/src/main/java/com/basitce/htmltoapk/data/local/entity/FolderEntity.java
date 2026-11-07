package com.basitce.htmltoapk.data.local.entity;

import androidx.datastore.preferences.protobuf.a1;
import com.android.apksig.internal.apk.a;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import l0.k;

/* loaded from: classes.dex */
public final class FolderEntity {
    public static final int $stable = 0;
    private final long createdAt;

    /* renamed from: id, reason: collision with root package name */
    private final long f5740id;
    private final String name;
    private final int sortOrder;

    public FolderEntity(long j10, String name, int i10, long j11) {
        r.e(name, "name");
        this.f5740id = j10;
        this.name = name;
        this.sortOrder = i10;
        this.createdAt = j11;
    }

    public static /* synthetic */ FolderEntity copy$default(FolderEntity folderEntity, long j10, String str, int i10, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = folderEntity.f5740id;
        }
        long j12 = j10;
        if ((i11 & 2) != 0) {
            str = folderEntity.name;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            i10 = folderEntity.sortOrder;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            j11 = folderEntity.createdAt;
        }
        return folderEntity.copy(j12, str2, i12, j11);
    }

    public final long component1() {
        return this.f5740id;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.sortOrder;
    }

    public final long component4() {
        return this.createdAt;
    }

    public final FolderEntity copy(long j10, String name, int i10, long j11) {
        r.e(name, "name");
        return new FolderEntity(j10, name, i10, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FolderEntity)) {
            return false;
        }
        FolderEntity folderEntity = (FolderEntity) obj;
        return this.f5740id == folderEntity.f5740id && r.a(this.name, folderEntity.name) && this.sortOrder == folderEntity.sortOrder && this.createdAt == folderEntity.createdAt;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final long getId() {
        return this.f5740id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSortOrder() {
        return this.sortOrder;
    }

    public int hashCode() {
        return Long.hashCode(this.createdAt) + a1.a(this.sortOrder, k.a(Long.hashCode(this.f5740id) * 31, 31, this.name), 31);
    }

    public String toString() {
        long j10 = this.f5740id;
        String str = this.name;
        int i10 = this.sortOrder;
        long j11 = this.createdAt;
        StringBuilder sb = new StringBuilder("FolderEntity(id=");
        sb.append(j10);
        sb.append(", name=");
        sb.append(str);
        sb.append(", sortOrder=");
        sb.append(i10);
        sb.append(", createdAt=");
        return a.a(j11, ")", sb);
    }

    public /* synthetic */ FolderEntity(long j10, String str, int i10, long j11, int i11, j jVar) {
        this((i11 & 1) != 0 ? 0L : j10, str, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? System.currentTimeMillis() : j11);
    }
}
