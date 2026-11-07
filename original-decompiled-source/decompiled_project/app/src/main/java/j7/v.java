package j7;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Size;
import g7.j;
import j7.i;
import kotlin.jvm.internal.b0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class v implements i {

    /* renamed from: a, reason: collision with root package name */
    public final ImageDecoder.Source f15249a;

    /* renamed from: b, reason: collision with root package name */
    public final AutoCloseable f15250b;

    /* renamed from: c, reason: collision with root package name */
    public final w7.m f15251c;

    /* renamed from: d, reason: collision with root package name */
    public final yh.i f15252d;

    public static final class a implements i.a {

        /* renamed from: a, reason: collision with root package name */
        public final yh.i f15253a;

        public a(yh.i iVar) {
            this.f15253a = iVar;
        }

        @Override // j7.i.a
        public final i a(l7.p pVar, w7.m mVar) {
            ImageDecoder.Source sourceA;
            Bitmap.Config configA = w7.h.a(mVar);
            if ((configA == Bitmap.Config.ARGB_8888 || configA == Bitmap.Config.HARDWARE) && (sourceA = y.a(pVar.f16761a, mVar, false)) != null) {
                return new v(sourceA, pVar.f16761a, mVar, this.f15253a);
            }
            return null;
        }
    }

    @vg.e(c = "coil3.decode.StaticImageDecoder", f = "StaticImageDecoder.kt", l = {168}, m = "decode")
    public static final class b extends vg.c {

        /* renamed from: a, reason: collision with root package name */
        public v f15254a;

        /* renamed from: b, reason: collision with root package name */
        public yh.i f15255b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15256c;

        /* renamed from: e, reason: collision with root package name */
        public int f15258e;

        public b(vg.c cVar) {
            super(cVar);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.f15256c = obj;
            this.f15258e |= PKIFailureInfo.systemUnavail;
            return v.this.a(this);
        }
    }

    public static final class c implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b0 f15260b;

        public c(b0 b0Var) {
            this.f15260b = b0Var;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            Size size = imageInfo.getSize();
            int width = size.getWidth();
            int height = size.getHeight();
            w7.m mVar = v.this.f15251c;
            long jA = h.a(width, height, mVar.f31402b, mVar.f31403c, (x7.h) g7.k.b(mVar, w7.g.f31388b));
            int i10 = (int) (jA >> 32);
            int i11 = (int) (jA & BodyPartID.bodyIdMax);
            if (width > 0 && height > 0 && (width != i10 || height != i11)) {
                double dB = h.b(width, height, i10, i11, mVar.f31403c);
                boolean z10 = dB < 1.0d;
                this.f15260b.f16318a = z10;
                if (z10 || mVar.f31404d == x7.c.f32185a) {
                    imageDecoder.setTargetSize(gh.a.a(width * dB), gh.a.a(dB * height));
                }
            }
            imageDecoder.setOnPartialImageListener(new u());
            imageDecoder.setAllocator(b8.b.a(w7.h.a(mVar)) ? 3 : 1);
            imageDecoder.setMemorySizePolicy(!((Boolean) g7.k.b(mVar, w7.h.f31397g)).booleanValue() ? 1 : 0);
            j.b<ColorSpace> bVar = w7.h.f31393c;
            if (((ColorSpace) g7.k.b(mVar, bVar)) != null) {
                imageDecoder.setTargetColorSpace((ColorSpace) g7.k.b(mVar, bVar));
            }
            imageDecoder.setUnpremultipliedRequired(!((Boolean) g7.k.b(mVar, w7.h.f31394d)).booleanValue());
        }
    }

    public v(ImageDecoder.Source source, AutoCloseable autoCloseable, w7.m mVar, yh.i iVar) {
        this.f15249a = source;
        this.f15250b = autoCloseable;
        this.f15251c = mVar;
        this.f15252d = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // j7.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tg.e<? super g> eVar) {
        b bVar;
        v vVar;
        yh.i iVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i10 = bVar.f15258e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f15258e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b((vg.c) eVar);
            }
        }
        Object obj = bVar.f15256c;
        ug.a aVar = ug.a.f29706a;
        int i11 = bVar.f15258e;
        if (i11 == 0) {
            pg.q.b(obj);
            bVar.f15254a = this;
            yh.i iVar2 = this.f15252d;
            bVar.f15255b = iVar2;
            bVar.f15258e = 1;
            if (iVar2.b(bVar) == aVar) {
                return aVar;
            }
            vVar = this;
            iVar = iVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = bVar.f15255b;
            vVar = bVar.f15254a;
            pg.q.b(obj);
        }
        try {
            AutoCloseable autoCloseable = vVar.f15250b;
            try {
                b0 b0Var = new b0();
                g gVar = new g(new g7.a(ImageDecoder.decodeBitmap(vVar.f15249a, vVar.new c(b0Var))), b0Var.f16318a);
                ch.a.a(autoCloseable, null);
                return gVar;
            } finally {
            }
        } finally {
            iVar.a();
        }
    }
}
