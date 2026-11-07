package com.basitce.htmltoapk.data.local.dao;

import android.content.Context;
import com.basitce.htmltoapk.R;
import java.io.File;
import java.util.List;
import pg.f0;
import x0.n1;
import x8.k8;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5707a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5708b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5709c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.f5707a = i10;
        this.f5708b = obj;
        this.f5709c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.l
    public final Object invoke(Object obj) {
        int i10 = this.f5707a;
        Object obj2 = this.f5709c;
        Object obj3 = this.f5708b;
        switch (i10) {
            case 0:
                return ((FolderDao_Impl) obj3).lambda$reorder$2((List) obj2, (tg.e) obj);
            default:
                Context context = (Context) obj3;
                n1 n1Var = (n1) obj2;
                e.a it = (e.a) obj;
                kotlin.jvm.internal.r.e(it, "it");
                File file = (File) n1Var.getValue();
                if (!context.getPackageManager().canRequestPackageInstalls()) {
                    org.bouncycastle.crypto.engines.a.b(context, R.string.install_permission_needed, context, 1);
                } else if (file != null && file.exists()) {
                    k8.b(context, file);
                }
                n1Var.setValue(null);
                return f0.f21461a;
        }
    }
}
