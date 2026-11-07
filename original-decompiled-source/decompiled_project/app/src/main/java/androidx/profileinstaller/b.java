package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import t5.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f2406a;

    /* renamed from: b, reason: collision with root package name */
    public final c.InterfaceC0035c f2407b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2408c;

    /* renamed from: d, reason: collision with root package name */
    public final File f2409d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2410e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2411f = false;

    /* renamed from: g, reason: collision with root package name */
    public t5.b[] f2412g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f2413h;

    public b(AssetManager assetManager, Executor executor, c.InterfaceC0035c interfaceC0035c, String str, File file) {
        byte[] bArr;
        this.f2406a = executor;
        this.f2407b = interfaceC0035c;
        this.f2410e = str;
        this.f2409d = file;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31) {
            switch (i10) {
                case 28:
                case 29:
                case 30:
                    bArr = g.f27977b;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = g.f27976a;
        }
        this.f2408c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f2407b.a();
            return null;
        }
    }

    public final void b(final int i10, final Serializable serializable) {
        this.f2406a.execute(new Runnable() { // from class: t5.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f27960a.f2407b.b(i10, serializable);
            }
        });
    }
}
