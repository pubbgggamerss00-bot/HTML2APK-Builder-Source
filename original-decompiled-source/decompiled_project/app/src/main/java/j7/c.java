package j7;

import a5.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import com.yalantis.ucrop.view.CropImageView;
import hi.c0;
import hi.e0;
import hi.f0;
import j7.c;
import j7.i;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final q f15206a;

    /* renamed from: b, reason: collision with root package name */
    public final w7.m f15207b;

    /* renamed from: c, reason: collision with root package name */
    public final yh.i f15208c;

    /* renamed from: d, reason: collision with root package name */
    public final n f15209d;

    public static final class a extends hi.p {

        /* renamed from: b, reason: collision with root package name */
        public Exception f15210b;

        @Override // hi.p, hi.l0
        public final long y(long j10, hi.g gVar) throws Exception {
            try {
                return super.y(j10, gVar);
            } catch (Exception e10) {
                this.f15210b = e10;
                throw e10;
            }
        }
    }

    public static final class b implements i.a {

        /* renamed from: a, reason: collision with root package name */
        public final yh.i f15211a;

        /* renamed from: b, reason: collision with root package name */
        public final n f15212b;

        public b(yh.i iVar, n nVar) {
            this.f15211a = iVar;
            this.f15212b = nVar;
        }

        @Override // j7.i.a
        public final i a(l7.p pVar, w7.m mVar) {
            return new c(pVar.f16761a, mVar, this.f15211a, this.f15212b);
        }
    }

    @vg.e(c = "coil3.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", l = {212, 40}, m = "decode")
    /* renamed from: j7.c$c, reason: collision with other inner class name */
    public static final class C0145c extends vg.c {

        /* renamed from: a, reason: collision with root package name */
        public Object f15213a;

        /* renamed from: b, reason: collision with root package name */
        public yh.i f15214b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15215c;

        /* renamed from: e, reason: collision with root package name */
        public int f15217e;

        public C0145c(vg.c cVar) {
            super(cVar);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.f15215c = obj;
            this.f15217e |= PKIFailureInfo.systemUnavail;
            return c.this.a(this);
        }
    }

    public c(q qVar, w7.m mVar, yh.i iVar, n nVar) {
        this.f15206a = qVar;
        this.f15207b = mVar;
        this.f15208c = iVar;
        this.f15209d = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // j7.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tg.e<? super g> eVar) throws Throwable {
        C0145c c0145c;
        yh.i iVar;
        final c cVar;
        yh.e eVar2;
        Throwable th2;
        if (eVar instanceof C0145c) {
            c0145c = (C0145c) eVar;
            int i10 = c0145c.f15217e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                c0145c.f15217e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                c0145c = new C0145c((vg.c) eVar);
            }
        }
        Object obj = c0145c.f15215c;
        ug.a aVar = ug.a.f29706a;
        int i11 = c0145c.f15217e;
        try {
            if (i11 == 0) {
                pg.q.b(obj);
                c0145c.f15213a = this;
                iVar = this.f15208c;
                c0145c.f15214b = iVar;
                c0145c.f15217e = 1;
                if (iVar.b(c0145c) != aVar) {
                    cVar = this;
                }
                return aVar;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar2 = (yh.e) c0145c.f15213a;
                try {
                    pg.q.b(obj);
                    g gVar = (g) obj;
                    eVar2.a();
                    return gVar;
                } catch (Throwable th3) {
                    th2 = th3;
                    eVar2.a();
                    throw th2;
                }
            }
            yh.i iVar2 = c0145c.f15214b;
            cVar = (c) c0145c.f15213a;
            pg.q.b(obj);
            iVar = iVar2;
            eh.a aVar2 = new eh.a() { // from class: j7.b
                /* JADX WARN: Removed duplicated region for block: B:111:0x01e1  */
                /* JADX WARN: Removed duplicated region for block: B:150:0x02a6  */
                /* JADX WARN: Removed duplicated region for block: B:163:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
                @Override // eh.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() throws Exception {
                    j jVar;
                    boolean z10;
                    int i12;
                    boolean z11;
                    Exception exc;
                    Bitmap bitmapCreateBitmap;
                    int iMin;
                    double dMax;
                    int iH;
                    b.d dVarC;
                    int iH2;
                    int i13;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    c cVar2 = this.f15205a;
                    w7.m mVar = cVar2.f15207b;
                    c.a aVar3 = new c.a(cVar2.f15206a.s0());
                    f0 f0VarB = hi.x.b(aVar3);
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(new e0(hi.x.b(new c0(f0VarB))), null, options);
                    Exception exc2 = aVar3.f15210b;
                    if (exc2 != null) {
                        throw exc2;
                    }
                    options.inJustDecodeBounds = false;
                    Paint paint = o.f15234a;
                    if (cVar2.f15209d.a(options.outMimeType)) {
                        a5.b bVar = new a5.b(new k(new e0(hi.x.b(new c0(f0VarB)))));
                        b.d dVarC2 = bVar.c("Orientation");
                        if (dVarC2 == null) {
                            iH = 1;
                            boolean z12 = iH != 2 || iH == 7 || iH == 4 || iH == 5;
                            dVarC = bVar.c("Orientation");
                            if (dVarC != null) {
                                iH2 = 1;
                                switch (iH2) {
                                    case 3:
                                    case 4:
                                        i13 = 180;
                                        break;
                                    case 5:
                                    case 8:
                                        i13 = 270;
                                        break;
                                    case 6:
                                    case 7:
                                        i13 = 90;
                                        break;
                                    default:
                                        i13 = 0;
                                        break;
                                }
                                jVar = new j(z12, i13);
                            } else {
                                try {
                                    iH2 = dVarC.h(bVar.f48g);
                                } catch (NumberFormatException unused) {
                                }
                                switch (iH2) {
                                }
                                jVar = new j(z12, i13);
                            }
                        } else {
                            try {
                                iH = dVarC2.h(bVar.f48g);
                            } catch (NumberFormatException unused2) {
                            }
                            if (iH != 2) {
                                dVarC = bVar.c("Orientation");
                                if (dVarC != null) {
                                }
                            }
                        }
                    } else {
                        jVar = j.f15227c;
                    }
                    int i14 = jVar.f15229b;
                    boolean z13 = jVar.f15228a;
                    Exception exc3 = aVar3.f15210b;
                    if (exc3 != null) {
                        throw exc3;
                    }
                    options.inMutable = false;
                    ColorSpace colorSpaceB = w7.h.b(mVar);
                    Context context = mVar.f31401a;
                    if (colorSpaceB != null) {
                        options.inPreferredColorSpace = (ColorSpace) g7.k.b(mVar, w7.h.f31393c);
                    }
                    options.inPremultiplied = ((Boolean) g7.k.b(mVar, w7.h.f31394d)).booleanValue();
                    Bitmap.Config config = (Bitmap.Config) g7.k.b(mVar, w7.h.f31392b);
                    if ((z13 || i14 > 0) && (config == null || b8.b.a(config))) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    if (((Boolean) g7.k.b(mVar, w7.h.f31397g)).booleanValue() && config == Bitmap.Config.ARGB_8888 && kotlin.jvm.internal.r.a(options.outMimeType, "image/jpeg")) {
                        config = Bitmap.Config.RGB_565;
                    }
                    Bitmap.Config config2 = options.outConfig;
                    Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
                    if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                        config = config3;
                    }
                    options.inPreferredConfig = config;
                    int i15 = options.outWidth;
                    try {
                        if (i15 > 0) {
                            int i16 = options.outHeight;
                            if (i16 > 0) {
                                int i17 = (i14 == 90 || i14 == 270) ? i16 : i15;
                                if (i14 != 90 && i14 != 270) {
                                    i15 = i16;
                                }
                                x7.h hVar = mVar.f31402b;
                                x7.f fVar = mVar.f31403c;
                                long jA = h.a(i17, i15, hVar, fVar, (x7.h) g7.k.b(mVar, w7.g.f31388b));
                                int i18 = (int) (jA >> 32);
                                int i19 = i17;
                                int i20 = (int) (jA & BodyPartID.bodyIdMax);
                                int iHighestOneBit = Integer.highestOneBit(i19 / i18);
                                int iHighestOneBit2 = Integer.highestOneBit(i15 / i20);
                                int iOrdinal = fVar.ordinal();
                                if (iOrdinal == 0) {
                                    iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new pg.l();
                                    }
                                    iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                                }
                                if (iMin < 1) {
                                    iMin = 1;
                                }
                                options.inSampleSize = iMin;
                                double d10 = i19;
                                z10 = z13;
                                double d11 = iMin;
                                double d12 = i18 / (d10 / d11);
                                double d13 = i20 / (i15 / d11);
                                int iOrdinal2 = fVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    dMax = Math.max(d12, d13);
                                } else {
                                    if (iOrdinal2 != 1) {
                                        throw new pg.l();
                                    }
                                    dMax = Math.min(d12, d13);
                                }
                                if (mVar.f31404d == x7.c.f32186b && dMax > 1.0d) {
                                    dMax = 1.0d;
                                }
                                boolean z14 = dMax == 1.0d;
                                options.inScaled = !z14;
                                if (!z14) {
                                    if (dMax > 1.0d) {
                                        options.inDensity = gh.a.a(Integer.MAX_VALUE / dMax);
                                        options.inTargetDensity = Integer.MAX_VALUE;
                                    } else {
                                        options.inDensity = Integer.MAX_VALUE;
                                        options.inTargetDensity = gh.a.a(Integer.MAX_VALUE * dMax);
                                    }
                                }
                                z11 = false;
                                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new e0(f0VarB), null, options);
                                f0VarB.close();
                                exc = aVar3.f15210b;
                                if (exc == null) {
                                    throw exc;
                                }
                                if (bitmapDecodeStream == null) {
                                    throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                                }
                                bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                                if (z10 || i14 > 0) {
                                    Matrix matrix = new Matrix();
                                    float width = bitmapDecodeStream.getWidth() / 2.0f;
                                    float height = bitmapDecodeStream.getHeight() / 2.0f;
                                    if (z10) {
                                        matrix.postScale(-1.0f, 1.0f, width, height);
                                    }
                                    if (i14 > 0) {
                                        matrix.postRotate(i14, width, height);
                                    }
                                    RectF rectF = new RectF(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                    matrix.mapRect(rectF);
                                    float f10 = rectF.left;
                                    if (f10 != CropImageView.DEFAULT_ASPECT_RATIO || rectF.top != CropImageView.DEFAULT_ASPECT_RATIO) {
                                        matrix.postTranslate(-f10, -rectF.top);
                                    }
                                    if (i14 == 90 || i14 == 270) {
                                        int height2 = bitmapDecodeStream.getHeight();
                                        int width2 = bitmapDecodeStream.getWidth();
                                        Bitmap.Config config4 = bitmapDecodeStream.getConfig();
                                        if (config4 == null) {
                                            config4 = Bitmap.Config.ARGB_8888;
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config4);
                                    } else {
                                        int width3 = bitmapDecodeStream.getWidth();
                                        int height3 = bitmapDecodeStream.getHeight();
                                        Bitmap.Config config5 = bitmapDecodeStream.getConfig();
                                        if (config5 == null) {
                                            config5 = Bitmap.Config.ARGB_8888;
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config5);
                                    }
                                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, o.f15234a);
                                    bitmapDecodeStream.recycle();
                                    bitmapDecodeStream = bitmapCreateBitmap;
                                }
                                return new g(g7.s.b(new BitmapDrawable(context.getResources(), bitmapDecodeStream)), (options.inSampleSize > 1 || options.inScaled) ? true : z11);
                            }
                            i12 = 1;
                            z10 = z13;
                        } else {
                            z10 = z13;
                            i12 = 1;
                        }
                        Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(new e0(f0VarB), null, options);
                        f0VarB.close();
                        exc = aVar3.f15210b;
                        if (exc == null) {
                        }
                    } finally {
                    }
                    options.inSampleSize = i12;
                    z11 = false;
                    options.inScaled = false;
                }
            };
            c0145c.f15213a = iVar;
            c0145c.f15214b = null;
            c0145c.f15217e = 2;
            Object objB = bi.b.b(aVar2, c0145c);
            if (objB != aVar) {
                eVar2 = iVar;
                obj = objB;
                g gVar2 = (g) obj;
                eVar2.a();
                return gVar2;
            }
            return aVar;
        } catch (Throwable th4) {
            eVar2 = iVar;
            th2 = th4;
            eVar2.a();
            throw th2;
        }
    }
}
