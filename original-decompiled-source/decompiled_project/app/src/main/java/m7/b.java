package m7;

import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.PostProcessor;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Size;
import g7.j;
import g7.k;
import g7.s;
import hi.x;
import j7.i;
import j7.q;
import j7.r;
import j7.y;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.b0;
import l7.p;
import m7.b.c;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import pg.l;
import ph.z0;
import uh.o;
import w7.m;

/* loaded from: classes.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final q f17674a;

    /* renamed from: b, reason: collision with root package name */
    public final m f17675b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17676c;

    public static final class a implements i.a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f17677a;

        public a() {
            this.f17677a = Build.VERSION.SDK_INT < 34;
        }

        @Override // j7.i.a
        public final i a(p pVar, m mVar) {
            hi.i iVarS0 = pVar.f16761a.s0();
            if (!iVarS0.A0(0L, f.f17694b) && !iVarS0.A0(0L, f.f17693a) && (!iVarS0.A0(0L, f.f17695c) || !iVarS0.A0(8L, f.f17696d) || !iVarS0.A0(12L, f.f17697e) || !iVarS0.Y(21L) || ((byte) (iVarS0.w().z(20L) & 2)) <= 0)) {
                if (Build.VERSION.SDK_INT < 30 || !iVarS0.A0(4L, f.f17698f)) {
                    return null;
                }
                if (!iVarS0.A0(8L, f.f17699g) && !iVarS0.A0(8L, f.f17700h) && !iVarS0.A0(8L, f.f17701i)) {
                    return null;
                }
            }
            return new b(pVar.f16761a, mVar, this.f17677a);
        }
    }

    @vg.e(c = "coil3.gif.AnimatedImageDecoder", f = "AnimatedImageDecoder.kt", l = {EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION, 100}, m = "decode")
    /* renamed from: m7.b$b, reason: collision with other inner class name */
    public static final class C0176b extends vg.c {

        /* renamed from: a, reason: collision with root package name */
        public Object f17678a;

        /* renamed from: b, reason: collision with root package name */
        public b0 f17679b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f17680c;

        /* renamed from: e, reason: collision with root package name */
        public int f17682e;

        public C0176b(vg.c cVar) {
            super(cVar);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.f17680c = obj;
            this.f17682e |= PKIFailureInfo.systemUnavail;
            return b.this.a(this);
        }
    }

    public static final class c implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b0 f17684b;

        public c(b0 b0Var) {
            this.f17684b = b0Var;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            Size size = imageInfo.getSize();
            int width = size.getWidth();
            int height = size.getHeight();
            m mVar = b.this.f17675b;
            long jA = j7.h.a(width, height, mVar.f31402b, mVar.f31403c, (x7.h) k.b(mVar, w7.g.f31388b));
            int i10 = (int) (jA >> 32);
            int i11 = (int) (jA & BodyPartID.bodyIdMax);
            if (width > 0 && height > 0 && (width != i10 || height != i11)) {
                double dB = j7.h.b(width, height, i10, i11, mVar.f31403c);
                boolean z10 = dB < 1.0d;
                this.f17684b.f16318a = z10;
                if (z10 || mVar.f31404d == x7.c.f32185a) {
                    imageDecoder.setTargetSize(gh.a.a(width * dB), gh.a.a(dB * height));
                }
            }
            imageDecoder.setAllocator(b8.b.a(w7.h.a(mVar)) ? 3 : 1);
            imageDecoder.setMemorySizePolicy(!((Boolean) k.b(mVar, w7.h.f31397g)).booleanValue() ? 1 : 0);
            j.b<ColorSpace> bVar = w7.h.f31393c;
            if (((ColorSpace) k.b(mVar, bVar)) != null) {
                imageDecoder.setTargetColorSpace((ColorSpace) k.b(mVar, bVar));
            }
            final e eVar = (e) k.b(mVar, g.f17703b);
            imageDecoder.setPostProcessor(eVar != null ? new PostProcessor() { // from class: n7.c
                @Override // android.graphics.PostProcessor
                public final int onPostProcess(Canvas canvas) {
                    int iOrdinal = eVar.a().ordinal();
                    if (iOrdinal == 0) {
                        return 0;
                    }
                    if (iOrdinal == 1) {
                        return -3;
                    }
                    if (iOrdinal == 2) {
                        return -1;
                    }
                    throw new l();
                }
            } : null);
        }
    }

    public b(q qVar, m mVar, boolean z10) {
        this.f17674a = qVar;
        this.f17675b = mVar;
        this.f17676c = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // j7.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tg.e<? super j7.g> eVar) {
        C0176b c0176b;
        b0 b0Var;
        b bVar;
        b0 b0Var2;
        if (eVar instanceof C0176b) {
            c0176b = (C0176b) eVar;
            int i10 = c0176b.f17682e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                c0176b.f17682e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                c0176b = new C0176b((vg.c) eVar);
            }
        }
        Object objB = c0176b.f17680c;
        ug.a aVar = ug.a.f29706a;
        int i11 = c0176b.f17682e;
        if (i11 == 0) {
            pg.q.b(objB);
            final b0 b0Var3 = new b0();
            eh.a aVar2 = new eh.a() { // from class: m7.a
                @Override // eh.a
                public final Object invoke() {
                    b0 b0Var4 = b0Var3;
                    b bVar2 = this.f17672a;
                    q qVarB = bVar2.f17674a;
                    if (bVar2.f17676c) {
                        hi.i iVarS0 = qVarB.s0();
                        if (iVarS0.A0(0L, f.f17694b) || iVarS0.A0(0L, f.f17693a)) {
                            qVarB = r.b(x.b(new n7.a(qVarB.s0())), qVarB.getFileSystem());
                        }
                    }
                    try {
                        ImageDecoder.Source sourceA = y.a(qVarB, bVar2.f17675b, true);
                        if (sourceA == null) {
                            hi.i iVarS02 = qVarB.s0();
                            try {
                                iVarS02.Y(Long.MAX_VALUE);
                                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((int) iVarS02.w().f13061b);
                                while (!iVarS02.w().p()) {
                                    iVarS02.w().read(byteBufferAllocateDirect);
                                }
                                byteBufferAllocateDirect.flip();
                                iVarS02.close();
                                sourceA = ImageDecoder.createSource(byteBufferAllocateDirect);
                            } finally {
                            }
                        }
                        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(sourceA, bVar2.new c(b0Var4));
                        ch.a.a(qVarB, null);
                        return drawableDecodeDrawable;
                    } finally {
                    }
                }
            };
            c0176b.f17678a = this;
            c0176b.f17679b = b0Var3;
            c0176b.f17682e = 1;
            Object objB2 = bi.b.b(aVar2, c0176b);
            if (objB2 != aVar) {
                b0Var = b0Var3;
                objB = objB2;
                bVar = this;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b0Var2 = (b0) c0176b.f17678a;
            pg.q.b(objB);
            return new j7.g(s.b((Drawable) objB), b0Var2.f16318a);
        }
        b0Var = c0176b.f17679b;
        bVar = (b) c0176b.f17678a;
        pg.q.b(objB);
        c0176b.f17678a = b0Var;
        c0176b.f17679b = null;
        c0176b.f17682e = 2;
        objB = bVar.b((Drawable) objB, c0176b);
        if (objB != aVar) {
            b0Var2 = b0Var;
            return new j7.g(s.b((Drawable) objB), b0Var2.f16318a);
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Drawable drawable, vg.c cVar) {
        m7.c cVar2;
        b bVar;
        if (cVar instanceof m7.c) {
            cVar2 = (m7.c) cVar;
            int i10 = cVar2.f17689e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                cVar2.f17689e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                cVar2 = new m7.c(this, cVar);
            }
        }
        Object obj = cVar2.f17687c;
        ug.a aVar = ug.a.f29706a;
        int i11 = cVar2.f17689e;
        if (i11 == 0) {
            pg.q.b(obj);
            if (!(drawable instanceof AnimatedImageDrawable)) {
                return drawable;
            }
            m mVar = this.f17675b;
            j.b<Integer> bVar2 = g.f17702a;
            if (((Number) k.b(mVar, bVar2)).intValue() != -2) {
                ((AnimatedImageDrawable) drawable).setRepeatCount(((Number) k.b(mVar, bVar2)).intValue());
            }
            eh.a aVar2 = (eh.a) k.b(mVar, g.f17704c);
            eh.a aVar3 = (eh.a) k.b(mVar, g.f17705d);
            if (aVar2 != null || aVar3 != null) {
                wh.c cVar3 = z0.f21632a;
                qh.g gVarH0 = o.f29764a.H0();
                d dVar = new d(drawable, aVar2, aVar3, null);
                cVar2.f17685a = this;
                cVar2.f17686b = (AnimatedImageDrawable) drawable;
                cVar2.f17689e = 1;
                if (ph.h.e(gVarH0, dVar, cVar2) == aVar) {
                    return aVar;
                }
            }
            bVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            drawable = cVar2.f17686b;
            bVar = cVar2.f17685a;
            pg.q.b(obj);
        }
        return new x7.g(drawable, bVar.f17675b.f31403c);
    }
}
