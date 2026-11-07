package v3;

import android.net.Uri;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f30593a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30594b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30595c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f30596d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30597e;

    /* renamed from: f, reason: collision with root package name */
    public final int f30598f;

    public l(Uri uri, int i10, int i11, boolean z10, String str, int i12) {
        uri.getClass();
        this.f30593a = uri;
        this.f30594b = i10;
        this.f30595c = i11;
        this.f30596d = z10;
        this.f30597e = str;
        this.f30598f = i12;
    }

    public l(String str, String str2) {
        this.f30593a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f30594b = 0;
        this.f30595c = 400;
        this.f30596d = false;
        this.f30597e = str2;
        this.f30598f = 0;
    }
}
