package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z80 extends b80 implements TextureView.SurfaceTextureListener, h80 {
    public String A;
    public String[] B;
    public boolean C;
    public int D;
    public n80 E;
    public final boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public float K;

    /* renamed from: u, reason: collision with root package name */
    public final p80 f11213u;

    /* renamed from: v, reason: collision with root package name */
    public final q80 f11214v;

    /* renamed from: w, reason: collision with root package name */
    public final o80 f11215w;

    /* renamed from: x, reason: collision with root package name */
    public f80 f11216x;

    /* renamed from: y, reason: collision with root package name */
    public Surface f11217y;

    /* renamed from: z, reason: collision with root package name */
    public ja0 f11218z;

    public z80(Context context, q80 q80Var, p80 p80Var, boolean z6, o80 o80Var) {
        super(context);
        this.D = 1;
        this.f11213u = p80Var;
        this.f11214v = q80Var;
        this.F = z6;
        this.f11215w = o80Var;
        setSurfaceTextureListener(this);
        q80Var.a(this);
    }

    public static String C(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void A(int i6) {
        ja0 ja0Var = this.f11218z;
        if (ja0Var != null) {
            ca0 ca0Var = ja0Var.f5989v;
            synchronized (ca0Var) {
                ca0Var.f3499e = i6 * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void B(int i6) {
        ja0 ja0Var = this.f11218z;
        if (ja0Var != null) {
            ca0 ca0Var = ja0Var.f5989v;
            synchronized (ca0Var) {
                ca0Var.f3497c = i6 * 1000;
            }
        }
    }

    public final void D() {
        if (this.G) {
            return;
        }
        this.G = true;
        zzs.zza.post(new x80(this, 1));
        zzn();
        q80 q80Var = this.f11214v;
        if (q80Var.f8257i && !q80Var.f8258j) {
            fo.d(q80Var.f8254e, q80Var.f8253d, "vfr2");
            q80Var.f8258j = true;
        }
        if (this.H) {
            s();
        }
    }

    public final void E(boolean z6, Integer num) {
        ja0 ja0Var = this.f11218z;
        if (ja0Var != null && !z6) {
            ja0Var.K = num;
            return;
        }
        if (this.A == null || this.f11217y == null) {
            return;
        }
        if (z6) {
            if (!I()) {
                zzo.zzj("No valid ExoPlayerAdapter exists when switch source.");
                return;
            }
            uc2 uc2Var = ja0Var.A;
            uc2Var.f9530v.a();
            uc2Var.f9529u.Q();
            F();
        }
        if (this.A.startsWith("cache:")) {
            s90 s90VarW = this.f11213u.w(this.A);
            if (s90VarW instanceof z90) {
                z90 z90Var = (z90) s90VarW;
                synchronized (z90Var) {
                    z90Var.f11228y = true;
                    z90Var.notify();
                }
                ja0 ja0Var2 = z90Var.f11225v;
                ja0Var2.D = null;
                z90Var.f11225v = null;
                this.f11218z = ja0Var2;
                ja0Var2.K = num;
                if (ja0Var2.A == null) {
                    zzo.zzj("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(s90VarW instanceof x90)) {
                    zzo.zzj("Stream cache miss: ".concat(String.valueOf(this.A)));
                    return;
                }
                x90 x90Var = (x90) s90VarW;
                p80 p80Var = this.f11213u;
                zzv.zzq().zzc(p80Var.getContext(), p80Var.zzn().afmaVersion);
                synchronized (x90Var.C) {
                    try {
                        ByteBuffer byteBuffer = x90Var.A;
                        if (byteBuffer != null && !x90Var.B) {
                            byteBuffer.flip();
                            x90Var.B = true;
                        }
                        x90Var.f10447x = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ByteBuffer byteBuffer2 = x90Var.A;
                boolean z7 = x90Var.F;
                String str = x90Var.f10445v;
                if (str == null) {
                    zzo.zzj("Stream cache URL is null.");
                    return;
                }
                o80 o80Var = this.f11215w;
                p80 p80Var2 = this.f11213u;
                ja0 ja0Var3 = new ja0(p80Var2.getContext(), o80Var, p80Var2, num);
                zzo.zzi("ExoPlayerAdapter initialized.");
                this.f11218z = ja0Var3;
                ja0Var3.r(new Uri[]{Uri.parse(str)}, byteBuffer2, z7);
            }
        } else {
            o80 o80Var2 = this.f11215w;
            p80 p80Var3 = this.f11213u;
            ja0 ja0Var4 = new ja0(p80Var3.getContext(), o80Var2, p80Var3, num);
            zzo.zzi("ExoPlayerAdapter initialized.");
            this.f11218z = ja0Var4;
            p80 p80Var4 = this.f11213u;
            zzv.zzq().zzc(p80Var4.getContext(), p80Var4.zzn().afmaVersion);
            Uri[] uriArr = new Uri[this.B.length];
            int i6 = 0;
            while (true) {
                String[] strArr = this.B;
                if (i6 >= strArr.length) {
                    break;
                }
                uriArr[i6] = Uri.parse(strArr[i6]);
                i6++;
            }
            ja0 ja0Var5 = this.f11218z;
            ja0Var5.getClass();
            ja0Var5.r(uriArr, ByteBuffer.allocate(0), false);
        }
        this.f11218z.D = this;
        G(this.f11217y);
        uc2 uc2Var2 = this.f11218z.A;
        if (uc2Var2 != null) {
            int iL = uc2Var2.l();
            this.D = iL;
            if (iL == 3) {
                D();
            }
        }
    }

    public final void F() {
        if (this.f11218z != null) {
            G(null);
            ja0 ja0Var = this.f11218z;
            if (ja0Var != null) {
                ja0Var.D = null;
                uc2 uc2Var = ja0Var.A;
                if (uc2Var != null) {
                    uc2Var.f9530v.a();
                    uc2Var.f9529u.A(ja0Var);
                    uc2 uc2Var2 = ja0Var.A;
                    uc2Var2.f9530v.a();
                    uc2Var2.f9529u.S();
                    ja0Var.A = null;
                    i80.f5598t.decrementAndGet();
                }
                this.f11218z = null;
            }
            this.D = 1;
            this.C = false;
            this.G = false;
            this.H = false;
        }
    }

    public final void G(Surface surface) {
        ja0 ja0Var = this.f11218z;
        if (ja0Var == null) {
            zzo.zzj("Trying to set surface before player is initialized.");
            return;
        }
        try {
            uc2 uc2Var = ja0Var.A;
            if (uc2Var != null) {
                uc2Var.f9530v.a();
                gb2 gb2Var = uc2Var.f9529u;
                gb2Var.N();
                gb2Var.J(surface);
                int i6 = surface == null ? 0 : -1;
                gb2Var.H(i6, i6);
            }
        } catch (IOException e6) {
            zzo.zzk(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }

    public final boolean H() {
        return I() && this.D != 1;
    }

    public final boolean I() {
        ja0 ja0Var = this.f11218z;
        return (ja0Var == null || ja0Var.A == null || this.C) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.h80
    public final void a(int i6) {
        ja0 ja0Var;
        if (this.D != i6) {
            this.D = i6;
            if (i6 == 3) {
                D();
                return;
            }
            if (i6 != 4) {
                return;
            }
            if (this.f11215w.f7631a && (ja0Var = this.f11218z) != null) {
                ja0Var.s(false);
            }
            this.f11214v.f8261m = false;
            t80 t80Var = this.f2979t;
            t80Var.f9128d = false;
            t80Var.a();
            zzs.zza.post(new cf(3, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.h80
    public final void b(final boolean z6, final long j6) {
        if (this.f11213u != null) {
            i70.f5591f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.y80
                @Override // java.lang.Runnable
                public final void run() {
                    this.s.f11213u.k0(z6, j6);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.h80
    public final void c(IOException iOException) {
        String strC = C("onLoadException", iOException);
        zzo.zzj("ExoPlayerAdapter exception: ".concat(strC));
        zzv.zzp().g("AdExoPlayerView.onException", iOException);
        zzs.zza.post(new bb(this, strC, 5, false));
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void d(int i6) {
        ja0 ja0Var = this.f11218z;
        if (ja0Var != null) {
            ca0 ca0Var = ja0Var.f5989v;
            synchronized (ca0Var) {
                ca0Var.f3496b = i6 * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.h80
    public final void e(String str, Exception exc) {
        ja0 ja0Var;
        String strC = C(str, exc);
        zzo.zzj("ExoPlayerAdapter error: ".concat(strC));
        this.C = true;
        if (this.f11215w.f7631a && (ja0Var = this.f11218z) != null) {
            ja0Var.s(false);
        }
        zzs.zza.post(new wx(2, this, strC));
        zzv.zzp().g("AdExoPlayerView.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void f(int i6) throws SocketException {
        ja0 ja0Var = this.f11218z;
        if (ja0Var != null) {
            Iterator it = ja0Var.N.iterator();
            while (it.hasNext()) {
                ba0 ba0Var = (ba0) ((WeakReference) it.next()).get();
                if (ba0Var != null) {
                    ba0Var.f3017r = i6;
                    Iterator it2 = ba0Var.s.iterator();
                    while (it2.hasNext()) {
                        Socket socket = (Socket) it2.next();
                        if (!socket.isClosed()) {
                            try {
                                socket.setReceiveBufferSize(ba0Var.f3017r);
                            } catch (SocketException e6) {
                                zzo.zzk("Failed to update receive buffer size.", e6);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.h80
    public final void g(int i6, int i7) {
        this.I = i6;
        this.J = i7;
        float f6 = i7 > 0 ? i6 / i7 : 1.0f;
        if (this.K != f6) {
            this.K = f6;
            requestLayout();
        }
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void h(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.B = new String[]{str};
        } else {
            this.B = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.A;
        boolean z6 = false;
        if (this.f11215w.f7640k && str2 != null && !str.equals(str2) && this.D == 4) {
            z6 = true;
        }
        this.A = str;
        E(z6, num);
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final int i() {
        if (H()) {
            return (int) this.f11218z.A.t();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final int j() {
        ja0 ja0Var = this.f11218z;
        if (ja0Var != null) {
            return ja0Var.F;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final int k() {
        if (H()) {
            return (int) this.f11218z.A.B();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final int l() {
        return this.J;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final int m() {
        return this.I;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final long n() {
        ja0 ja0Var = this.f11218z;
        if (ja0Var != null) {
            return ja0Var.u();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final long o() {
        ja0 ja0Var = this.f11218z;
        if (ja0Var == null) {
            return -1L;
        }
        if (ja0Var.M == null || !ja0Var.M.f3815o) {
            return ja0Var.E;
        }
        return 0L;
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f6 = this.K;
        if (f6 != 0.0f && this.E == null) {
            float f7 = measuredWidth;
            float f8 = f7 / measuredHeight;
            if (f6 > f8) {
                measuredHeight = (int) (f7 / f6);
            }
            if (f6 < f8) {
                measuredWidth = (int) (measuredHeight * f6);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        n80 n80Var = this.E;
        if (n80Var != null) {
            n80Var.a(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i6, int i7) throws InterruptedException {
        ja0 ja0Var;
        float f6;
        int i8;
        SurfaceTexture surfaceTexture2;
        if (this.F) {
            n80 n80Var = new n80(getContext());
            this.E = n80Var;
            n80Var.E = i6;
            n80Var.D = i7;
            n80Var.G = surfaceTexture;
            n80Var.start();
            n80 n80Var2 = this.E;
            if (n80Var2.G == null) {
                surfaceTexture2 = null;
            } else {
                try {
                    n80Var2.L.await();
                } catch (InterruptedException unused) {
                }
                surfaceTexture2 = n80Var2.F;
            }
            if (surfaceTexture2 != null) {
                surfaceTexture = surfaceTexture2;
            } else {
                this.E.b();
                this.E = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f11217y = surface;
        if (this.f11218z == null) {
            E(false, null);
        } else {
            G(surface);
            if (!this.f11215w.f7631a && (ja0Var = this.f11218z) != null) {
                ja0Var.s(true);
            }
        }
        int i9 = this.I;
        if (i9 == 0 || (i8 = this.J) == 0) {
            f6 = i7 > 0 ? i6 / i7 : 1.0f;
            if (this.K != f6) {
                this.K = f6;
                requestLayout();
            }
        } else {
            f6 = i8 > 0 ? i9 / i8 : 1.0f;
            if (this.K != f6) {
                this.K = f6;
                requestLayout();
            }
        }
        zzs.zza.post(new v80(this, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        r();
        n80 n80Var = this.E;
        if (n80Var != null) {
            n80Var.b();
            this.E = null;
        }
        ja0 ja0Var = this.f11218z;
        if (ja0Var != null) {
            if (ja0Var != null) {
                ja0Var.s(false);
            }
            Surface surface = this.f11217y;
            if (surface != null) {
                surface.release();
            }
            this.f11217y = null;
            G(null);
        }
        zzs.zza.post(new x80(this, 0));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i6, int i7) {
        n80 n80Var = this.E;
        if (n80Var != null) {
            n80Var.a(i6, i7);
        }
        zzs.zza.post(new y70(this, i6, i7, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f11214v.d(this);
        this.s.a(surfaceTexture, this.f11216x);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i6) {
        zze.zza("AdExoPlayerView3 window visibility changed to " + i6);
        zzs.zza.post(new cg(i6, 1, this));
        super.onWindowVisibilityChanged(i6);
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final long p() {
        ja0 ja0Var = this.f11218z;
        if (ja0Var != null) {
            return ja0Var.q();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final String q() {
        return "ExoPlayer/2".concat(true != this.F ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void r() {
        ja0 ja0Var;
        if (H()) {
            if (this.f11215w.f7631a && (ja0Var = this.f11218z) != null) {
                ja0Var.s(false);
            }
            uc2 uc2Var = this.f11218z.A;
            uc2Var.f9530v.a();
            uc2Var.f9529u.P(false);
            this.f11214v.f8261m = false;
            t80 t80Var = this.f2979t;
            t80Var.f9128d = false;
            t80Var.a();
            zzs.zza.post(new u80(this, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void s() {
        ja0 ja0Var;
        if (!H()) {
            this.H = true;
            return;
        }
        if (this.f11215w.f7631a && (ja0Var = this.f11218z) != null) {
            ja0Var.s(true);
        }
        uc2 uc2Var = this.f11218z.A;
        uc2Var.f9530v.a();
        uc2Var.f9529u.P(true);
        this.f11214v.b();
        t80 t80Var = this.f2979t;
        t80Var.f9128d = true;
        t80Var.a();
        this.s.f6280c = true;
        zzs.zza.post(new u80(this, 0));
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void t(int i6) {
        if (H()) {
            long j6 = i6;
            uc2 uc2Var = this.f11218z.A;
            uc2Var.c(uc2Var.h(), j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void u(f80 f80Var) {
        this.f11216x = f80Var;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void v(String str) {
        if (str != null) {
            h(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void w() {
        if (I()) {
            uc2 uc2Var = this.f11218z.A;
            uc2Var.f9530v.a();
            uc2Var.f9529u.Q();
            F();
        }
        q80 q80Var = this.f11214v;
        q80Var.f8261m = false;
        t80 t80Var = this.f2979t;
        t80Var.f9128d = false;
        t80Var.a();
        q80Var.c();
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void x(float f6, float f7) {
        n80 n80Var = this.E;
        if (n80Var != null) {
            n80Var.c(f6, f7);
        }
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final Integer y() {
        ja0 ja0Var = this.f11218z;
        if (ja0Var != null) {
            return ja0Var.K;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void z(int i6) {
        ja0 ja0Var = this.f11218z;
        if (ja0Var != null) {
            ca0 ca0Var = ja0Var.f5989v;
            synchronized (ca0Var) {
                ca0Var.f3498d = i6 * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.s80
    public final void zzn() {
        zzs.zza.post(new v80(this, 0));
    }

    @Override // com.google.android.gms.internal.ads.h80
    public final void zzv() {
        zzs.zza.post(new t(3, this));
    }
}
