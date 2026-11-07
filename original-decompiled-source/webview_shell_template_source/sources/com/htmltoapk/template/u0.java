package com.htmltoapk.template;

import android.graphics.Typeface;
import android.print.PrintDocumentAdapter;
import android.widget.LinearLayout;
import java.util.Iterator;
import l0.f;
import org.json.JSONException;
import w2.t;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f12608t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12609u;

    public /* synthetic */ u0(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f12608t = obj;
        this.f12609u = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.s) {
            case 0:
                WebViewActivity.saveBytesToDownloads$lambda$101((WebViewActivity) this.f12608t, (String) this.f12609u);
                break;
            case 1:
                ((f.c) this.f12608t).c((Typeface) this.f12609u);
                break;
            case 2:
                w2.t tVar = (w2.t) this.f12608t;
                d5.c cVar = (d5.c) this.f12609u;
                if (!tVar.K) {
                    Iterator it = tVar.G.iterator();
                    while (it.hasNext()) {
                        ((t.a) it.next()).q();
                    }
                    tVar.D.f1459a.b();
                    tVar.k(((Number) cVar.f12739t).floatValue(), ((Number) cVar.s).intValue());
                    break;
                }
                break;
            case 3:
                w2.t tVar2 = (w2.t) this.f12608t;
                LinearLayout linearLayout = (LinearLayout) this.f12609u;
                if (!tVar2.Q) {
                    linearLayout.setVisibility(4);
                    break;
                }
                break;
            default:
                ((PrintDocumentAdapter.WriteResultCallback) this.f12608t).onWriteFailed(((Exception) this.f12609u).getMessage());
                break;
        }
    }
}
