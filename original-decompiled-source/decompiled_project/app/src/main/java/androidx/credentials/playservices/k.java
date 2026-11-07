package androidx.credentials.playservices;

import android.content.Context;
import android.content.pm.PackageManager;
import android.print.PrintDocumentAdapter;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1724b;

    public /* synthetic */ k(Object obj, int i10) {
        this.f1723a = i10;
        this.f1724b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws PackageManager.NameNotFoundException, IOException {
        switch (this.f1723a) {
            case 0:
                ((d4.t) this.f1724b).onResult(null);
                break;
            case 1:
                ((PrintDocumentAdapter.WriteResultCallback) this.f1724b).onWriteCancelled();
                break;
            default:
                androidx.profileinstaller.c.b((Context) this.f1724b, new d4.n(), androidx.profileinstaller.c.f2414a, false);
                break;
        }
    }
}
