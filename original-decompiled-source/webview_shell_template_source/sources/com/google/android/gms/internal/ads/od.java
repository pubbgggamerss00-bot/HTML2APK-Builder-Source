package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class od implements m52 {

    /* renamed from: b, reason: collision with root package name */
    public static final od f7714b = new od(0);

    /* renamed from: c, reason: collision with root package name */
    public static final od f7715c = new od(1);

    /* renamed from: d, reason: collision with root package name */
    public static final od f7716d = new od(2);

    /* renamed from: e, reason: collision with root package name */
    public static final od f7717e = new od(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7718a;

    public /* synthetic */ od(int i6) {
        this.f7718a = i6;
    }

    @Override // com.google.android.gms.internal.ads.m52
    public final boolean a(int i6) {
        switch (this.f7718a) {
            case 0:
                if (i6 == 0 || i6 == 1) {
                }
                break;
            case 1:
                if (i6 == 0 || i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4 || i6 == 5) {
                }
                break;
            case 2:
                if (i6 == 0 || i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4 || i6 == 5) {
                }
                break;
            default:
                if (i6 == 0 || i6 == 1 || i6 == 2 || i6 == 3) {
                }
                break;
        }
        return true;
    }
}
