package com.basitce.htmltoapk.data.local.entity;

import androidx.room.z0;
import com.android.apksig.internal.apk.a;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import l0.k;
import r.o2;

/* loaded from: classes.dex */
public final class KeystoreEntity {
    public static final int $stable = 0;
    private final String algorithm;
    private final String alias;
    private final long createdAt;

    /* renamed from: id, reason: collision with root package name */
    private final long f5741id;
    private final boolean isPersisted;
    private final String keyAlias;
    private final String keyPassword;
    private final String password;
    private final String path;
    private final String publicUri;

    public KeystoreEntity(long j10, String alias, String path, String password, String keyAlias, String algorithm, boolean z10, String str, String str2, long j11) {
        r.e(alias, "alias");
        r.e(path, "path");
        r.e(password, "password");
        r.e(keyAlias, "keyAlias");
        r.e(algorithm, "algorithm");
        this.f5741id = j10;
        this.alias = alias;
        this.path = path;
        this.password = password;
        this.keyAlias = keyAlias;
        this.algorithm = algorithm;
        this.isPersisted = z10;
        this.publicUri = str;
        this.keyPassword = str2;
        this.createdAt = j11;
    }

    public final long component1() {
        return this.f5741id;
    }

    public final long component10() {
        return this.createdAt;
    }

    public final String component2() {
        return this.alias;
    }

    public final String component3() {
        return this.path;
    }

    public final String component4() {
        return this.password;
    }

    public final String component5() {
        return this.keyAlias;
    }

    public final String component6() {
        return this.algorithm;
    }

    public final boolean component7() {
        return this.isPersisted;
    }

    public final String component8() {
        return this.publicUri;
    }

    public final String component9() {
        return this.keyPassword;
    }

    public final KeystoreEntity copy(long j10, String alias, String path, String password, String keyAlias, String algorithm, boolean z10, String str, String str2, long j11) {
        r.e(alias, "alias");
        r.e(path, "path");
        r.e(password, "password");
        r.e(keyAlias, "keyAlias");
        r.e(algorithm, "algorithm");
        return new KeystoreEntity(j10, alias, path, password, keyAlias, algorithm, z10, str, str2, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeystoreEntity)) {
            return false;
        }
        KeystoreEntity keystoreEntity = (KeystoreEntity) obj;
        return this.f5741id == keystoreEntity.f5741id && r.a(this.alias, keystoreEntity.alias) && r.a(this.path, keystoreEntity.path) && r.a(this.password, keystoreEntity.password) && r.a(this.keyAlias, keystoreEntity.keyAlias) && r.a(this.algorithm, keystoreEntity.algorithm) && this.isPersisted == keystoreEntity.isPersisted && r.a(this.publicUri, keystoreEntity.publicUri) && r.a(this.keyPassword, keystoreEntity.keyPassword) && this.createdAt == keystoreEntity.createdAt;
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
        return this.f5741id;
    }

    public final String getKeyAlias() {
        return this.keyAlias;
    }

    public final String getKeyPassword() {
        return this.keyPassword;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getPublicUri() {
        return this.publicUri;
    }

    public int hashCode() {
        int iA = o2.a(k.a(k.a(k.a(k.a(k.a(Long.hashCode(this.f5741id) * 31, 31, this.alias), 31, this.path), 31, this.password), 31, this.keyAlias), 31, this.algorithm), 31, this.isPersisted);
        String str = this.publicUri;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.keyPassword;
        return Long.hashCode(this.createdAt) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final boolean isPersisted() {
        return this.isPersisted;
    }

    public String toString() {
        long j10 = this.f5741id;
        String str = this.alias;
        String str2 = this.path;
        String str3 = this.password;
        String str4 = this.keyAlias;
        String str5 = this.algorithm;
        boolean z10 = this.isPersisted;
        String str6 = this.publicUri;
        String str7 = this.keyPassword;
        long j11 = this.createdAt;
        StringBuilder sb = new StringBuilder("KeystoreEntity(id=");
        sb.append(j10);
        sb.append(", alias=");
        sb.append(str);
        z0.a(sb, ", path=", str2, ", password=", str3);
        z0.a(sb, ", keyAlias=", str4, ", algorithm=", str5);
        sb.append(", isPersisted=");
        sb.append(z10);
        sb.append(", publicUri=");
        sb.append(str6);
        sb.append(", keyPassword=");
        sb.append(str7);
        sb.append(", createdAt=");
        return a.a(j11, ")", sb);
    }

    public /* synthetic */ KeystoreEntity(long j10, String str, String str2, String str3, String str4, String str5, boolean z10, String str6, String str7, long j11, int i10, j jVar) {
        this((i10 & 1) != 0 ? 0L : j10, str, str2, str3, str4, str5, (i10 & 64) != 0 ? false : z10, (i10 & 128) != 0 ? null : str6, (i10 & 256) != 0 ? null : str7, (i10 & 512) != 0 ? System.currentTimeMillis() : j11);
    }
}
