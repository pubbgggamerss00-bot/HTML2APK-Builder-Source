package jg;

import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;

/* loaded from: classes2.dex */
public final class d implements mg.b<Object> {

    /* renamed from: a, reason: collision with root package name */
    public volatile f8.e f15731a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15732b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Hilt_HtmlToApkApplication.a f15733c;

    public d(Hilt_HtmlToApkApplication.a aVar) {
        this.f15733c = aVar;
    }

    @Override // mg.b
    public final Object generatedComponent() {
        if (this.f15731a == null) {
            synchronized (this.f15732b) {
                try {
                    if (this.f15731a == null) {
                        this.f15731a = new f8.e(new kg.a(Hilt_HtmlToApkApplication.this));
                    }
                } finally {
                }
            }
        }
        return this.f15731a;
    }
}
