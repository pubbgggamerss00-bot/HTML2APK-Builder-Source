package com.basitce.htmltoapk.data.local.dao;

import android.os.Bundle;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5729b;

    public /* synthetic */ o(Object obj, int i10) {
        this.f5728a = i10;
        this.f5729b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f5728a) {
            case 0:
                return ProjectDao_Impl.lambda$countByKind$6((String) this.f5729b, (h6.b) obj);
            default:
                Bundle source = (Bundle) this.f5729b;
                String key = (String) obj;
                kotlin.jvm.internal.r.e(key, "key");
                kotlin.jvm.internal.r.e(source, "source");
                return Boolean.valueOf(!source.containsKey(key));
        }
    }
}
