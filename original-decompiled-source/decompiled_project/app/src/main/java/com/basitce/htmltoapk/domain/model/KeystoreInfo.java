package com.basitce.htmltoapk.domain.model;

import androidx.room.z0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import l0.k;

/* loaded from: classes.dex */
public final class KeystoreInfo {
    public static final int $stable = 0;
    private final String algorithm;
    private final String alias;
    private final long createdAt;

    /* renamed from: id, reason: collision with root package name */
    private final long f5743id;
    private final String path;

    public KeystoreInfo(long j10, String alias, String path, String algorithm, long j11) {
        r.e(alias, "alias");
        r.e(path, "path");
        r.e(algorithm, "algorithm");
        this.f5743id = j10;
        this.alias = alias;
        this.path = path;
        this.algorithm = algorithm;
        this.createdAt = j11;
    }

    public static /* synthetic */ KeystoreInfo copy$default(KeystoreInfo keystoreInfo, long j10, String str, String str2, String str3, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = keystoreInfo.f5743id;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            str = keystoreInfo.alias;
        }
        String str4 = str;
        if ((i10 & 4) != 0) {
            str2 = keystoreInfo.path;
        }
        String str5 = str2;
        if ((i10 & 8) != 0) {
            str3 = keystoreInfo.algorithm;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            j11 = keystoreInfo.createdAt;
        }
        return keystoreInfo.copy(j12, str4, str5, str6, j11);
    }

    public final long component1() {
        return this.f5743id;
    }

    public final String component2() {
        return this.alias;
    }

    public final String component3() {
        return this.path;
    }

    public final String component4() {
        return this.algorithm;
    }

    public final long component5() {
        return this.createdAt;
    }

    public final KeystoreInfo copy(long j10, String alias, String path, String algorithm, long j11) {
        r.e(alias, "alias");
        r.e(path, "path");
        r.e(algorithm, "algorithm");
        return new KeystoreInfo(j10, alias, path, algorithm, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeystoreInfo)) {
            return false;
        }
        KeystoreInfo keystoreInfo = (KeystoreInfo) obj;
        return this.f5743id == keystoreInfo.f5743id && r.a(this.alias, keystoreInfo.alias) && r.a(this.path, keystoreInfo.path) && r.a(this.algorithm, keystoreInfo.algorithm) && this.createdAt == keystoreInfo.createdAt;
    }

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final String getAlias() {
        return this.alias;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final long getId() {
        return this.f5743id;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return Long.hashCode(this.createdAt) + k.a(k.a(k.a(Long.hashCode(this.f5743id) * 31, 31, this.alias), 31, this.path), 31, this.algorithm);
    }

    public String toString() {
        long j10 = this.f5743id;
        String str = this.alias;
        String str2 = this.path;
        String str3 = this.algorithm;
        long j11 = this.createdAt;
        StringBuilder sb = new StringBuilder("KeystoreInfo(id=");
        sb.append(j10);
        sb.append(", alias=");
        sb.append(str);
        z0.a(sb, ", path=", str2, ", algorithm=", str3);
        sb.append(", createdAt=");
        sb.append(j11);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ KeystoreInfo(long j10, String str, String str2, String str3, long j11, int i10, j jVar) {
        this((i10 & 1) != 0 ? 0L : j10, str, str2, str3, (i10 & 16) != 0 ? System.currentTimeMillis() : j11);
    }
}
