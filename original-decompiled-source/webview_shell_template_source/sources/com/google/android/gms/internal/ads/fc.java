package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fc {

    /* renamed from: a, reason: collision with root package name */
    public long f4599a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4600b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4601c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4602d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4603e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4604f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4605g;
    public final List h;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    public fc(String str, za zaVar) {
        String str2 = zaVar.f11234b;
        long j6 = zaVar.f11235c;
        long j7 = zaVar.f11236d;
        long j8 = zaVar.f11237e;
        long j9 = zaVar.f11238f;
        List arrayList = zaVar.h;
        if (arrayList == 0) {
            Map map = zaVar.f11239g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new hb((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j6, j7, j8, j9, arrayList);
    }

    public static fc a(gc gcVar) throws IOException {
        if (ic.d(gcVar) != 538247942) {
            throw new IOException();
        }
        String strG = ic.g(gcVar);
        String strG2 = ic.g(gcVar);
        long jE = ic.e(gcVar);
        long jE2 = ic.e(gcVar);
        long jE3 = ic.e(gcVar);
        long jE4 = ic.e(gcVar);
        int iD = ic.d(gcVar);
        if (iD < 0) {
            throw new IOException(androidx.camera.camera2.internal.compat.workaround.c.d(iD, "readHeaderList size="));
        }
        List arrayList = iD == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i6 = 0; i6 < iD; i6++) {
            arrayList.add(new hb(ic.g(gcVar).intern(), ic.g(gcVar).intern()));
        }
        return new fc(strG, strG2, jE, jE2, jE3, jE4, arrayList);
    }

    public fc(String str, String str2, long j6, long j7, long j8, long j9, List list) {
        this.f4600b = str;
        this.f4601c = true == RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(str2) ? null : str2;
        this.f4602d = j6;
        this.f4603e = j7;
        this.f4604f = j8;
        this.f4605g = j9;
        this.h = list;
    }
}
