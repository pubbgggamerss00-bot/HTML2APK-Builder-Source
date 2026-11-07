package cc;

/* loaded from: classes2.dex */
public final class u extends c {
    @Override // cc.c
    public final boolean a() {
        return false;
    }

    @Override // cc.c
    public final int b() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.b() == 0 && !cVar.a();
    }

    public final int hashCode() {
        return -721381028;
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=0, allowAssetPackDeletion=false}";
    }
}
