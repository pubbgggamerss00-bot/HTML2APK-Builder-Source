package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f80 extends FrameLayout implements a80 {
    public boolean A;
    public boolean B;
    public boolean C;
    public long D;
    public long E;
    public String F;
    public String[] G;
    public Bitmap H;
    public final ImageView I;
    public boolean J;
    public final p80 s;

    /* renamed from: t, reason: collision with root package name */
    public final FrameLayout f4537t;

    /* renamed from: u, reason: collision with root package name */
    public final View f4538u;

    /* renamed from: v, reason: collision with root package name */
    public final oo f4539v;

    /* renamed from: w, reason: collision with root package name */
    public final r80 f4540w;

    /* renamed from: x, reason: collision with root package name */
    public final long f4541x;

    /* renamed from: y, reason: collision with root package name */
    public final b80 f4542y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4543z;

    public f80(Context context, p80 p80Var, int i6, boolean z6, oo ooVar, o80 o80Var) {
        Context context2;
        b80 z70Var;
        super(context);
        this.s = p80Var;
        this.f4539v = ooVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f4537t = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        com.google.android.gms.common.internal.l.f(p80Var.zzj());
        c80 c80Var = p80Var.zzj().zza;
        q80 q80Var = new q80(context, p80Var.zzn(), p80Var.zzs(), ooVar, p80Var.zzk());
        if (i6 == 3) {
            z70Var = new na0(context, q80Var);
            context2 = context;
        } else if (i6 == 2) {
            p80Var.zzO().getClass();
            context2 = context;
            z70Var = new z80(context2, q80Var, p80Var, z6, o80Var);
        } else {
            context2 = context;
            z70Var = new z70(context2, p80Var, z6, p80Var.zzO().b(), new q80(context2, p80Var.zzn(), p80Var.zzs(), ooVar, p80Var.zzk()));
        }
        this.f4542y = z70Var;
        View view = new View(context2);
        this.f4538u = view;
        view.setBackgroundColor(0);
        frameLayout.addView(z70Var, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) zzbe.zzc().a(zn.S)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) zzbe.zzc().a(zn.P)).booleanValue()) {
            k();
        }
        this.I = new ImageView(context2);
        this.f4541x = ((Long) zzbe.zzc().a(zn.U)).longValue();
        boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.R)).booleanValue();
        this.C = zBooleanValue;
        ooVar.b("spinner_used", true != zBooleanValue ? "0" : "1");
        this.f4540w = new r80(this);
        z70Var.u(this);
    }

    public final void a(int i6, int i7, int i8, int i9) {
        if (zze.zzc()) {
            StringBuilder sbA = androidx.camera.camera2.internal.g0.a("Set video bounds to x:", i6, ";y:", i7, ";w:");
            sbA.append(i8);
            sbA.append(";h:");
            sbA.append(i9);
            zze.zza(sbA.toString());
        }
        if (i8 == 0 || i9 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i8, i9);
        layoutParams.setMargins(i6, i7, 0, 0);
        this.f4537t.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void b() {
        p80 p80Var = this.s;
        if (p80Var.zzi() == null || !this.A || this.B) {
            return;
        }
        p80Var.zzi().getWindow().clearFlags(128);
        this.A = false;
    }

    public final void c(String str, String... strArr) {
        HashMap map = new HashMap();
        b80 b80Var = this.f4542y;
        Integer numY = b80Var != null ? b80Var.y() : null;
        if (numY != null) {
            map.put("playerId", numY.toString());
        }
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.s.G("onVideoEvent", map);
    }

    public final void d() {
        if (((Boolean) zzbe.zzc().a(zn.f11352a2)).booleanValue()) {
            this.f4540w.a();
        }
        c("ended", new String[0]);
        b();
    }

    public final void e() {
        c("pause", new String[0]);
        b();
        this.f4543z = false;
    }

    public final void f() {
        if (((Boolean) zzbe.zzc().a(zn.f11352a2)).booleanValue()) {
            r80 r80Var = this.f4540w;
            r80Var.f8582t = false;
            uj1 uj1Var = zzs.zza;
            uj1Var.removeCallbacks(r80Var);
            uj1Var.postDelayed(r80Var, 250L);
        }
        p80 p80Var = this.s;
        if (p80Var.zzi() != null && !this.A) {
            boolean z6 = (p80Var.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.B = z6;
            if (!z6) {
                p80Var.zzi().getWindow().addFlags(128);
                this.A = true;
            }
        }
        this.f4543z = true;
    }

    public final void finalize() throws Throwable {
        try {
            this.f4540w.a();
            b80 b80Var = this.f4542y;
            if (b80Var != null) {
                i70.f5591f.execute(new b(7, b80Var));
            }
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        b80 b80Var = this.f4542y;
        if (b80Var != null && this.E == 0) {
            c("canplaythrough", "duration", String.valueOf(b80Var.k() / 1000.0f), "videoWidth", String.valueOf(b80Var.m()), "videoHeight", String.valueOf(b80Var.l()));
        }
    }

    public final void h() {
        this.f4538u.setVisibility(4);
        zzs.zza.post(new p(3, this));
    }

    public final void i() {
        if (this.J && this.H != null) {
            ImageView imageView = this.I;
            if (imageView.getParent() == null) {
                imageView.setImageBitmap(this.H);
                imageView.invalidate();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                FrameLayout frameLayout = this.f4537t;
                frameLayout.addView(imageView, layoutParams);
                frameLayout.bringChildToFront(imageView);
            }
        }
        this.f4540w.a();
        this.E = this.D;
        zzs.zza.post(new yh(3, this));
    }

    public final void j(int i6, int i7) {
        if (this.C) {
            on onVar = zn.T;
            int iMax = Math.max(i6 / ((Integer) zzbe.zzc().a(onVar)).intValue(), 1);
            int iMax2 = Math.max(i7 / ((Integer) zzbe.zzc().a(onVar)).intValue(), 1);
            Bitmap bitmap = this.H;
            if (bitmap != null && bitmap.getWidth() == iMax && this.H.getHeight() == iMax2) {
                return;
            }
            this.H = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.J = false;
        }
    }

    public final void k() {
        b80 b80Var = this.f4542y;
        if (b80Var == null) {
            return;
        }
        TextView textView = new TextView(b80Var.getContext());
        Resources resourcesB = zzv.zzp().b();
        textView.setText(String.valueOf(resourcesB == null ? "AdMob - " : resourcesB.getString(R.string.watermark_label_prefix)).concat(b80Var.q()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        FrameLayout frameLayout = this.f4537t;
        frameLayout.addView(textView, layoutParams);
        frameLayout.bringChildToFront(textView);
    }

    public final void l() {
        b80 b80Var = this.f4542y;
        if (b80Var == null) {
            return;
        }
        long jI = b80Var.i();
        if (this.D == jI || jI <= 0) {
            return;
        }
        float f6 = jI / 1000.0f;
        if (((Boolean) zzbe.zzc().a(zn.Y1)).booleanValue()) {
            c("timeupdate", "time", String.valueOf(f6), "totalBytes", String.valueOf(b80Var.p()), "qoeCachedBytes", String.valueOf(b80Var.n()), "qoeLoadedBytes", String.valueOf(b80Var.o()), "droppedFrames", String.valueOf(b80Var.j()), "reportTime", String.valueOf(zzv.zzC().a()));
        } else {
            c("timeupdate", "time", String.valueOf(f6));
        }
        this.D = jI;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        r80 r80Var = this.f4540w;
        if (z6) {
            r80Var.f8582t = false;
            uj1 uj1Var = zzs.zza;
            uj1Var.removeCallbacks(r80Var);
            uj1Var.postDelayed(r80Var, 250L);
        } else {
            r80Var.a();
            this.E = this.D;
        }
        zzs.zza.post(new d80(this, z6, 0));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i6) {
        super.onWindowVisibilityChanged(i6);
        boolean z6 = false;
        r80 r80Var = this.f4540w;
        if (i6 == 0) {
            r80Var.f8582t = false;
            uj1 uj1Var = zzs.zza;
            uj1Var.removeCallbacks(r80Var);
            uj1Var.postDelayed(r80Var, 250L);
            z6 = true;
        } else {
            r80Var.a();
            this.E = this.D;
        }
        zzs.zza.post(new e80(this, z6));
    }
}
