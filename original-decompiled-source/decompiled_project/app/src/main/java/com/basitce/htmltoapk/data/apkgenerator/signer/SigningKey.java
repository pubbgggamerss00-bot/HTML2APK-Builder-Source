package com.basitce.htmltoapk.data.apkgenerator.signer;

import java.io.File;
import kotlin.jvm.internal.r;
import l0.k;

/* loaded from: classes.dex */
public final class SigningKey {
    public static final int $stable = 8;
    private final String alias;
    private final File file;
    private final String keyPassword;
    private final String password;

    public SigningKey(File file, String password, String alias, String keyPassword) {
        r.e(file, "file");
        r.e(password, "password");
        r.e(alias, "alias");
        r.e(keyPassword, "keyPassword");
        this.file = file;
        this.password = password;
        this.alias = alias;
        this.keyPassword = keyPassword;
    }

    public static /* synthetic */ SigningKey copy$default(SigningKey signingKey, File file, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            file = signingKey.file;
        }
        if ((i10 & 2) != 0) {
            str = signingKey.password;
        }
        if ((i10 & 4) != 0) {
            str2 = signingKey.alias;
        }
        if ((i10 & 8) != 0) {
            str3 = signingKey.keyPassword;
        }
        return signingKey.copy(file, str, str2, str3);
    }

    public final File component1() {
        return this.file;
    }

    public final String component2() {
        return this.password;
    }

    public final String component3() {
        return this.alias;
    }

    public final String component4() {
        return this.keyPassword;
    }

    public final SigningKey copy(File file, String password, String alias, String keyPassword) {
        r.e(file, "file");
        r.e(password, "password");
        r.e(alias, "alias");
        r.e(keyPassword, "keyPassword");
        return new SigningKey(file, password, alias, keyPassword);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SigningKey)) {
            return false;
        }
        SigningKey signingKey = (SigningKey) obj;
        return r.a(this.file, signingKey.file) && r.a(this.password, signingKey.password) && r.a(this.alias, signingKey.alias) && r.a(this.keyPassword, signingKey.keyPassword);
    }

    public final String getAlias() {
        return this.alias;
    }

    public final File getFile() {
        return this.file;
    }

    public final String getKeyPassword() {
        return this.keyPassword;
    }

    public final String getPassword() {
        return this.password;
    }

    public int hashCode() {
        return this.keyPassword.hashCode() + k.a(k.a(this.file.hashCode() * 31, 31, this.password), 31, this.alias);
    }

    public String toString() {
        return "SigningKey(file=" + this.file + ", password=" + this.password + ", alias=" + this.alias + ", keyPassword=" + this.keyPassword + ")";
    }
}
