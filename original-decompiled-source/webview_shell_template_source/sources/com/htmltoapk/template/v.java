package com.htmltoapk.template;

import android.net.Uri;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements p5.a {
    public final /* synthetic */ int s = 0;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AndroidAPI f12610t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f12611u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f12612v;

    public /* synthetic */ v(AndroidAPI androidAPI, String str, Uri uri) {
        this.f12610t = androidAPI;
        this.f12611u = str;
        this.f12612v = uri;
    }

    @Override // p5.a
    public final Object a() {
        switch (this.s) {
            case 0:
                return AndroidAPI.shareFileFromBase64$lambda$85$lambda$84(this.f12610t, this.f12611u, (Uri) this.f12612v);
            default:
                return AndroidAPI.requestPermissions$lambda$38(this.f12610t, (ArrayList) this.f12612v, this.f12611u);
        }
    }

    public /* synthetic */ v(AndroidAPI androidAPI, ArrayList arrayList, String str) {
        this.f12610t = androidAPI;
        this.f12612v = arrayList;
        this.f12611u = str;
    }
}
