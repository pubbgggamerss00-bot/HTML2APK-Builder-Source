package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z70 extends b80 implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    public static final HashMap K;
    public Uri A;
    public int B;
    public int C;
    public int D;
    public n80 E;
    public final boolean F;
    public int G;
    public f80 H;
    public boolean I;
    public Integer J;

    /* renamed from: u, reason: collision with root package name */
    public final p80 f11201u;

    /* renamed from: v, reason: collision with root package name */
    public final q80 f11202v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f11203w;

    /* renamed from: x, reason: collision with root package name */
    public int f11204x;

    /* renamed from: y, reason: collision with root package name */
    public int f11205y;

    /* renamed from: z, reason: collision with root package name */
    public MediaPlayer f11206z;

    static {
        HashMap map = new HashMap();
        K = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(701, "MEDIA_INFO_BUFFERING_START");
        map.put(702, "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        map.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public z70(Context context, p80 p80Var, boolean z6, boolean z7, q80 q80Var) {
        super(context);
        this.f11204x = 0;
        this.f11205y = 0;
        this.I = false;
        this.J = null;
        setSurfaceTextureListener(this);
        this.f11201u = p80Var;
        this.f11202v = q80Var;
        this.F = z6;
        this.f11203w = z7;
        q80Var.a(this);
    }

    public final void C() throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        SurfaceTexture surfaceTexture;
        zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture2 = getSurfaceTexture();
        if (this.A == null || surfaceTexture2 == null) {
            return;
        }
        D(false);
        try {
            zzv.zzl();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f11206z = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f11206z.setOnCompletionListener(this);
            this.f11206z.setOnErrorListener(this);
            this.f11206z.setOnInfoListener(this);
            this.f11206z.setOnPreparedListener(this);
            this.f11206z.setOnVideoSizeChangedListener(this);
            this.D = 0;
            if (this.F) {
                n80 n80Var = new n80(getContext());
                this.E = n80Var;
                int width = getWidth();
                int height = getHeight();
                n80Var.E = width;
                n80Var.D = height;
                n80Var.G = surfaceTexture2;
                this.E.start();
                n80 n80Var2 = this.E;
                if (n80Var2.G == null) {
                    surfaceTexture = null;
                } else {
                    try {
                        n80Var2.L.await();
                    } catch (InterruptedException unused) {
                    }
                    surfaceTexture = n80Var2.F;
                }
                if (surfaceTexture != null) {
                    surfaceTexture2 = surfaceTexture;
                } else {
                    this.E.b();
                    this.E = null;
                }
            }
            this.f11206z.setDataSource(getContext(), this.A);
            zzv.zzm();
            this.f11206z.setSurface(new Surface(surfaceTexture2));
            this.f11206z.setAudioStreamType(3);
            this.f11206z.setScreenOnWhilePlaying(true);
            this.f11206z.prepareAsync();
            E(1);
        } catch (IOException e6) {
            e = e6;
            zzo.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.A)), e);
            onError(this.f11206z, 1, 0);
        } catch (IllegalArgumentException e7) {
            e = e7;
            zzo.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.A)), e);
            onError(this.f11206z, 1, 0);
        } catch (IllegalStateException e8) {
            e = e8;
            zzo.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.A)), e);
            onError(this.f11206z, 1, 0);
        }
    }

    public final void D(boolean z6) {
        zze.zza("AdMediaPlayerView release");
        n80 n80Var = this.E;
        if (n80Var != null) {
            n80Var.b();
            this.E = null;
        }
        MediaPlayer mediaPlayer = this.f11206z;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f11206z.release();
            this.f11206z = null;
            E(0);
            if (z6) {
                this.f11205y = 0;
            }
        }
    }

    public final void E(int i6) {
        t80 t80Var = this.f2979t;
        q80 q80Var = this.f11202v;
        if (i6 == 3) {
            q80Var.b();
            t80Var.f9128d = true;
            t80Var.a();
        } else if (this.f11204x == 3) {
            q80Var.f8261m = false;
            t80Var.f9128d = false;
            t80Var.a();
        }
        this.f11204x = i6;
    }

    public final boolean F() {
        int i6;
        return (this.f11206z == null || (i6 = this.f11204x) == -1 || i6 == 0 || i6 == 1) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final int i() {
        if (F()) {
            return this.f11206z.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final int j() {
        if (Build.VERSION.SDK_INT < 26 || !F()) {
            return -1;
        }
        return this.f11206z.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final int k() {
        if (F()) {
            return this.f11206z.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final int l() {
        MediaPlayer mediaPlayer = this.f11206z;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final int m() {
        MediaPlayer mediaPlayer = this.f11206z;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final long n() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final long o() {
        if (this.J != null) {
            return (p() * this.D) / 100;
        }
        return -1L;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i6) {
        this.D = i6;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        zze.zza("AdMediaPlayerView completion");
        E(5);
        this.f11205y = 5;
        zzs.zza.post(new u(3, this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i6, int i7) {
        Integer numValueOf = Integer.valueOf(i6);
        HashMap map = K;
        String str = (String) map.get(numValueOf);
        String str2 = (String) map.get(Integer.valueOf(i7));
        zzo.zzj("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        E(-1);
        this.f11205y = -1;
        zzs.zza.post(new x70(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i6, int i7) {
        Integer numValueOf = Integer.valueOf(i6);
        HashMap map = K;
        zze.zza("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(numValueOf)) + ":" + ((String) map.get(Integer.valueOf(i7))));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i6, int i7) {
        int i8;
        int defaultSize = View.getDefaultSize(this.B, i6);
        int defaultSize2 = View.getDefaultSize(this.C, i7);
        if (this.B > 0 && this.C > 0 && this.E == null) {
            int mode = View.MeasureSpec.getMode(i6);
            int size = View.MeasureSpec.getSize(i6);
            int mode2 = View.MeasureSpec.getMode(i7);
            int size2 = View.MeasureSpec.getSize(i7);
            if (mode != 1073741824) {
                if (mode != 1073741824) {
                    int i9 = (this.C * size) / this.B;
                    if (mode2 != Integer.MIN_VALUE || i9 <= size2) {
                        defaultSize2 = i9;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                } else {
                    if (mode2 == 1073741824) {
                        i8 = (this.B * size2) / this.C;
                        if (mode == Integer.MIN_VALUE && i8 > size) {
                            defaultSize = size;
                        }
                        defaultSize2 = size2;
                    } else {
                        int i10 = this.B;
                        int i11 = this.C;
                        if (mode2 != Integer.MIN_VALUE || i11 <= size2) {
                            i8 = i10;
                            size2 = i11;
                        } else {
                            i8 = (size2 * i10) / i11;
                        }
                        if (mode == Integer.MIN_VALUE && i8 > size) {
                            defaultSize2 = (i11 * size) / i10;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i8;
                    defaultSize2 = size2;
                }
            } else if (mode2 == 1073741824) {
                int i12 = this.B;
                int i13 = i12 * size2;
                int i14 = this.C;
                int i15 = size * i14;
                if (i13 < i15) {
                    defaultSize = i13 / i14;
                    defaultSize2 = size2;
                } else {
                    if (i13 > i15) {
                        defaultSize2 = i15 / i12;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                }
            } else {
                mode = 1073741824;
                if (mode != 1073741824) {
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        n80 n80Var = this.E;
        if (n80Var != null) {
            n80Var.a(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        zze.zza("AdMediaPlayerView prepared");
        E(2);
        q80 q80Var = this.f11202v;
        if (q80Var.f8257i && !q80Var.f8258j) {
            fo.d(q80Var.f8254e, q80Var.f8253d, "vfr2");
            q80Var.f8258j = true;
        }
        zzs.zza.post(new bb(4, this, mediaPlayer));
        this.B = mediaPlayer.getVideoWidth();
        this.C = mediaPlayer.getVideoHeight();
        int i6 = this.G;
        if (i6 != 0) {
            t(i6);
        }
        if (this.f11203w && F() && this.f11206z.getCurrentPosition() > 0 && this.f11205y != 3) {
            zze.zza("AdMediaPlayerView nudging MediaPlayer");
            MediaPlayer mediaPlayer2 = this.f11206z;
            if (mediaPlayer2 != null) {
                try {
                    mediaPlayer2.setVolume(0.0f, 0.0f);
                } catch (IllegalStateException unused) {
                }
            } else {
                zzo.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            }
            this.f11206z.start();
            int currentPosition = this.f11206z.getCurrentPosition();
            long jA = zzv.zzC().a();
            while (F() && this.f11206z.getCurrentPosition() == currentPosition && zzv.zzC().a() - jA <= 250) {
            }
            this.f11206z.pause();
            zzn();
        }
        zzo.zzi("AdMediaPlayerView stream dimensions: " + this.B + " x " + this.C);
        if (this.f11205y == 3) {
            s();
        }
        zzn();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i6, int i7) throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        zze.zza("AdMediaPlayerView surface created");
        C();
        zzs.zza.post(new p(2, this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f11206z;
        if (mediaPlayer != null && this.G == 0) {
            this.G = mediaPlayer.getCurrentPosition();
        }
        n80 n80Var = this.E;
        if (n80Var != null) {
            n80Var.b();
        }
        zzs.zza.post(new x(4, this));
        D(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i6, int i7) throws IllegalStateException {
        zze.zza("AdMediaPlayerView surface changed");
        int i8 = this.f11205y;
        boolean z6 = false;
        if (this.B == i6 && this.C == i7) {
            z6 = true;
        }
        if (this.f11206z != null && i8 == 3 && z6) {
            int i9 = this.G;
            if (i9 != 0) {
                t(i9);
            }
            s();
        }
        n80 n80Var = this.E;
        if (n80Var != null) {
            n80Var.a(i6, i7);
        }
        zzs.zza.post(new y70(this, i6, i7, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f11202v.d(this);
        this.s.a(surfaceTexture, this.H);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i6, int i7) {
        zze.zza("AdMediaPlayerView size changed: " + i6 + " x " + i7);
        this.B = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.C = videoHeight;
        if (this.B == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i6) {
        zze.zza("AdMediaPlayerView window visibility changed to " + i6);
        zzs.zza.post(new w70(i6, 0, this));
        super.onWindowVisibilityChanged(i6);
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final long p() {
        if (this.J != null) {
            return k() * this.J.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final String q() {
        return "MediaPlayer".concat(true != this.F ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void r() throws IllegalStateException {
        zze.zza("AdMediaPlayerView pause");
        if (F() && this.f11206z.isPlaying()) {
            this.f11206z.pause();
            E(4);
            zzs.zza.post(new t(2, this));
        }
        this.f11205y = 4;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void s() throws IllegalStateException {
        zze.zza("AdMediaPlayerView play");
        if (F()) {
            this.f11206z.start();
            E(3);
            this.s.f6280c = true;
            zzs.zza.post(new yh(2, this));
        }
        this.f11205y = 3;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void t(int i6) throws IllegalStateException {
        zze.zza("AdMediaPlayerView seek " + i6);
        if (!F()) {
            this.G = i6;
        } else {
            this.f11206z.seekTo(i6);
            this.G = 0;
        }
    }

    @Override // android.view.View
    public final String toString() {
        return androidx.activity.m.d(z70.class.getName(), "@", Integer.toHexString(hashCode()));
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void u(f80 f80Var) {
        this.H = f80Var;
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void v(String str) throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        Uri uri = Uri.parse(str);
        xj xjVarL = xj.l(uri);
        if (xjVarL == null || xjVarL.s != null) {
            if (xjVarL != null) {
                uri = Uri.parse(xjVarL.s);
            }
            this.A = uri;
            this.G = 0;
            C();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void w() throws IllegalStateException {
        zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f11206z;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f11206z.release();
            this.f11206z = null;
            E(0);
            this.f11205y = 0;
        }
        this.f11202v.c();
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void x(float f6, float f7) {
        n80 n80Var = this.E;
        if (n80Var != null) {
            n80Var.c(f6, f7);
        }
    }

    @Override // com.google.android.gms.internal.ads.s80
    public final void zzn() {
        t80 t80Var = this.f2979t;
        float f6 = t80Var.f9127c ? t80Var.f9129e ? 0.0f : t80Var.f9130f : 0.0f;
        MediaPlayer mediaPlayer = this.f11206z;
        if (mediaPlayer == null) {
            zzo.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f6, f6);
            } catch (IllegalStateException unused) {
            }
        }
    }
}
