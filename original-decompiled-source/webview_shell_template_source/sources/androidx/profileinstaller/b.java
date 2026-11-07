package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.activity.l;
import androidx.profileinstaller.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import s1.e;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f1349a;

    /* renamed from: b, reason: collision with root package name */
    public final c.InterfaceC0016c f1350b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f1351c;

    /* renamed from: d, reason: collision with root package name */
    public final File f1352d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1353e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1354f = false;

    /* renamed from: g, reason: collision with root package name */
    public s1.a[] f1355g;
    public byte[] h;

    public b(AssetManager assetManager, Executor executor, c.InterfaceC0016c interfaceC0016c, String str, File file) {
        byte[] bArr;
        this.f1349a = executor;
        this.f1350b = interfaceC0016c;
        this.f1353e = str;
        this.f1352d = file;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 31) {
            switch (i6) {
                case 24:
                case 25:
                    bArr = e.f14347e;
                    break;
                case 26:
                    bArr = e.f14346d;
                    break;
                case 27:
                    bArr = e.f14345c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = e.f14344b;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = e.f14343a;
        }
        this.f1351c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e6) {
            String message = e6.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f1350b.a();
            return null;
        }
    }

    public final void b(int i6, Serializable serializable) {
        this.f1349a.execute(new l(i6, 1, this, serializable));
    }
}
