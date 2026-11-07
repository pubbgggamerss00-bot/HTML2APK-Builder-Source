package hf;

import android.util.Log;
import cf.l;
import cf.r;
import cf.t;
import com.yalantis.ucrop.view.CropImageView;
import java.io.Closeable;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Stack;
import mf.n;

/* loaded from: classes2.dex */
public final class e implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final b f13011a;

    /* renamed from: b, reason: collision with root package name */
    public r f13012b;

    /* renamed from: c, reason: collision with root package name */
    public final g f13013c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13014d;

    /* renamed from: e, reason: collision with root package name */
    public final Stack<n> f13015e;

    /* renamed from: f, reason: collision with root package name */
    public final Stack<pf.b> f13016f;

    /* renamed from: g, reason: collision with root package name */
    public final Stack<pf.b> f13017g;

    /* renamed from: h, reason: collision with root package name */
    public final NumberFormat f13018h;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f13019j;

    public e(b bVar, d dVar) throws IOException {
        cf.a aVar;
        cf.e eVar = bVar.f12997a;
        this.f13014d = false;
        this.f13015e = new Stack<>();
        this.f13016f = new Stack<>();
        this.f13017g = new Stack<>();
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        this.f13018h = numberInstance;
        this.f13019j = new byte[32];
        this.f13011a = bVar;
        l lVar = l.E0;
        boolean zE = dVar.e();
        cf.d dVar2 = dVar.f13007a;
        if (zE) {
            t tVarG0 = eVar.g0();
            l lVar2 = l.W;
            cf.b bVarV0 = dVar2.v0(lVar2);
            if (bVarV0 instanceof cf.a) {
                aVar = (cf.a) bVarV0;
            } else {
                cf.a aVar2 = new cf.a();
                aVar2.g0(bVarV0);
                aVar = aVar2;
            }
            ArrayList arrayList = aVar.f5416b;
            arrayList.add(tVarG0);
            t tVarG02 = eVar.g0();
            this.f13012b = tVarG02.V0(lVar);
            p();
            close();
            arrayList.add(0, tVarG02);
            dVar2.O0(lVar2, aVar);
            this.f13012b = tVarG0.V0(lVar);
            l();
        } else {
            dVar.e();
            t tVarG03 = eVar.g0();
            cf.d dVar3 = dVar.f13007a;
            l lVar3 = l.W;
            dVar3.getClass();
            dVar3.O0(lVar3, tVarG03);
            this.f13012b = tVarG03.V0(lVar);
        }
        g gVarC = dVar.c();
        this.f13013c = gVarC;
        if (gVarC == null) {
            g gVar = new g();
            this.f13013c = gVar;
            cf.d dVar4 = dVar.f13007a;
            dVar.f13008b = gVar;
            dVar4.P0(l.W1, gVar);
        }
        numberInstance.setMaximumFractionDigits(5);
        numberInstance.setGroupingUsed(false);
    }

    public static boolean h(double d10) {
        return d10 < 0.0d || d10 > 1.0d;
    }

    public final void E(float f10, float f11, float f12) throws IOException {
        if (h(f10) || h(f11) || h(f12)) {
            throw new IllegalArgumentException("Parameters must be within 0..1, but are ".concat(String.format("(%.2f,%.2f,%.2f)", Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12))));
        }
        d0(f10);
        d0(f11);
        d0(f12);
        e0("rg");
        pf.c cVar = pf.c.f21442b;
        Stack<pf.b> stack = this.f13016f;
        if (stack.isEmpty()) {
            stack.add(cVar);
        } else {
            stack.setElementAt(cVar, stack.size() - 1);
        }
    }

    public final void M(float f10, float f11, float f12) throws IOException {
        if (h(f10) || h(f11) || h(f12)) {
            throw new IllegalArgumentException("Parameters must be within 0..1, but are ".concat(String.format("(%.2f,%.2f,%.2f)", Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12))));
        }
        d0(f10);
        d0(f11);
        d0(f12);
        e0("RG");
        pf.c cVar = pf.c.f21442b;
        Stack<pf.b> stack = this.f13017g;
        if (stack.isEmpty()) {
            stack.add(cVar);
        } else {
            stack.setElementAt(cVar, stack.size() - 1);
        }
    }

    public final void N(wf.c cVar) throws IOException {
        if (!this.f13014d) {
            throw new IllegalStateException("Error: must call beginText() before setTextMatrix");
        }
        float[] fArr = cVar.f31528a;
        double[] dArr = {fArr[0], fArr[1], fArr[3], fArr[4], fArr[6], fArr[7]};
        for (int i10 = 0; i10 < 6; i10++) {
            d0((float) dArr[i10]);
        }
        e0("Tm");
    }

    public final void Z(String str) throws IOException {
        if (!this.f13014d) {
            throw new IllegalStateException("Must call beginText() before showText()");
        }
        Stack<n> stack = this.f13015e;
        if (stack.isEmpty()) {
            throw new IllegalStateException("Must call setFont() before showText()");
        }
        n nVarPeek = stack.peek();
        if (nVarPeek.e()) {
            int iCharCount = 0;
            while (iCharCount < str.length()) {
                int iCodePointAt = str.codePointAt(iCharCount);
                nVarPeek.a(iCodePointAt);
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
        gf.b.d0(nVarPeek.c(str), this.f13012b);
        this.f13012b.write(" ".getBytes(wf.a.f31520a));
        e0("Tj");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f13014d) {
            Log.w("PdfBox-Android", "You did not call endText(), some viewers won't display your text");
        }
        r rVar = this.f13012b;
        if (rVar != null) {
            rVar.close();
            this.f13012b = null;
        }
    }

    public final void d0(float f10) throws IOException {
        int iA;
        int i10;
        long j10;
        int i11;
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            throw new IllegalArgumentException(f10 + " is not a finite number");
        }
        NumberFormat numberFormat = this.f13018h;
        int maximumFractionDigits = numberFormat.getMaximumFractionDigits();
        long[] jArr = wf.d.f31529a;
        if (Float.isNaN(f10) || Float.isInfinite(f10) || f10 > 9.223372E18f || f10 <= -9.223372E18f || maximumFractionDigits > 5) {
            iA = -1;
        } else {
            long j11 = (long) f10;
            byte[] bArr = this.f13019j;
            if (f10 < CropImageView.DEFAULT_ASPECT_RATIO) {
                bArr[0] = 45;
                j11 = -j11;
                i10 = 1;
            } else {
                i10 = 0;
            }
            double dAbs = Math.abs(f10) - j11;
            long j12 = jArr[maximumFractionDigits];
            long j13 = j11;
            long j14 = (long) ((dAbs * j12) + 0.5d);
            if (j14 >= j12) {
                j14 -= j12;
                j10 = j13 + 1;
            } else {
                j10 = j13;
            }
            int i12 = 0;
            while (true) {
                i11 = 18;
                if (i12 >= 18) {
                    break;
                }
                int i13 = i12 + 1;
                if (j10 < jArr[i13]) {
                    i11 = i12;
                    break;
                }
                i12 = i13;
            }
            iA = wf.d.a(j10, i11, false, bArr, i10);
            if (j14 > 0 && maximumFractionDigits > 0) {
                bArr[iA] = 46;
                iA = wf.d.a(j14, maximumFractionDigits - 1, true, bArr, iA + 1);
            }
        }
        if (iA == -1) {
            this.f13012b.write(numberFormat.format(f10).getBytes(wf.a.f31520a));
        } else {
            this.f13012b.write(this.f13019j, 0, iA);
        }
        this.f13012b.write(32);
    }

    public final void e0(String str) throws IOException {
        this.f13012b.write(str.getBytes(wf.a.f31520a));
        this.f13012b.write(10);
    }

    public final void l() throws IOException {
        if (this.f13014d) {
            Log.w("PdfBox-Android", "Restoring the graphics state is not allowed within text objects.");
        }
        Stack<n> stack = this.f13015e;
        if (!stack.isEmpty()) {
            stack.pop();
        }
        Stack<pf.b> stack2 = this.f13017g;
        if (!stack2.isEmpty()) {
            stack2.pop();
        }
        Stack<pf.b> stack3 = this.f13016f;
        if (!stack3.isEmpty()) {
            stack3.pop();
        }
        e0("Q");
    }

    public final void p() throws IOException {
        if (this.f13014d) {
            Log.w("PdfBox-Android", "Saving the graphics state is not allowed within text objects.");
        }
        Stack<n> stack = this.f13015e;
        if (!stack.isEmpty()) {
            stack.push(stack.peek());
        }
        Stack<pf.b> stack2 = this.f13017g;
        if (!stack2.isEmpty()) {
            stack2.push(stack2.peek());
        }
        Stack<pf.b> stack3 = this.f13016f;
        if (!stack3.isEmpty()) {
            stack3.push(stack3.peek());
        }
        e0("q");
    }

    public final void z(n nVar, float f10) throws IOException {
        Stack<n> stack = this.f13015e;
        if (stack.isEmpty()) {
            stack.add(nVar);
        } else {
            stack.setElementAt(nVar, stack.size() - 1);
        }
        if (nVar.e()) {
            this.f13011a.f13002f.add(nVar);
        }
        g gVar = this.f13013c;
        gVar.getClass();
        gVar.a(l.G0, "F", nVar).i0(this.f13012b);
        this.f13012b.write(32);
        d0(f10);
        e0("Tf");
    }
}
