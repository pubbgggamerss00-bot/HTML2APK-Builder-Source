package k0;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import i0.i2;
import i0.l4;
import i0.v1;
import j2.k5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import k0.p1;
import m0.x2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.x1;
import t2.f0;

/* loaded from: classes.dex */
public final class s1 implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final p1.a f15902a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15903b;

    /* renamed from: c, reason: collision with root package name */
    public final i2 f15904c;

    /* renamed from: d, reason: collision with root package name */
    public final x2 f15905d;

    /* renamed from: e, reason: collision with root package name */
    public final k5 f15906e;

    /* renamed from: f, reason: collision with root package name */
    public int f15907f;

    /* renamed from: g, reason: collision with root package name */
    public y2.c0 f15908g;

    /* renamed from: h, reason: collision with root package name */
    public int f15909h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15910i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f15911j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f15912k = true;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<y2.i, pg.f0> {
        public a() {
            super(1);
        }

        @Override // eh.l
        public final pg.f0 invoke(y2.i iVar) {
            s1.this.b(iVar);
            return pg.f0.f21461a;
        }
    }

    public s1(y2.c0 c0Var, p1.a aVar, boolean z10, i2 i2Var, x2 x2Var, k5 k5Var) {
        this.f15902a = aVar;
        this.f15903b = z10;
        this.f15904c = i2Var;
        this.f15905d = x2Var;
        this.f15906e = k5Var;
        this.f15908g = c0Var;
    }

    public final void b(y2.i iVar) {
        this.f15907f++;
        try {
            this.f15911j.add(iVar);
        } finally {
            c();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z10 = this.f15912k;
        if (!z10) {
            return z10;
        }
        this.f15907f++;
        return true;
    }

    public final boolean c() {
        int i10 = this.f15907f - 1;
        this.f15907f = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f15911j;
            if (!arrayList.isEmpty()) {
                p1.this.f15888c.invoke(qg.x.e0(arrayList));
                arrayList.clear();
            }
        }
        return this.f15907f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f15912k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f15911j.clear();
        this.f15907f = 0;
        this.f15912k = false;
        ArrayList arrayList = p1.this.f15895j;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (kotlin.jvm.internal.r.a(((WeakReference) arrayList.get(i10)).get(), this)) {
                arrayList.remove(i10);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f15912k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.f15912k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f15912k;
        return z10 ? this.f15903b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f15912k;
        if (z10) {
            b(new y2.a(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    public final void d(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f15912k;
        if (!z10) {
            return z10;
        }
        b(new y2.g(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f15912k;
        if (!z10) {
            return z10;
        }
        b(new y2.h(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return c();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z10 = this.f15912k;
        if (!z10) {
            return z10;
        }
        b(new y2.l());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        y2.c0 c0Var = this.f15908g;
        return TextUtils.getCapsMode(c0Var.f33682a.f27761b, t2.j0.e(c0Var.f33683b), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f15910i = z10;
        if (z10) {
            this.f15909h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return e6.c.a(this.f15908g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        if (t2.j0.b(this.f15908g.f33683b)) {
            return null;
        }
        return y2.d0.a(this.f15908g).f27761b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        return y2.d0.b(this.f15908g, i10).f27761b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        return y2.d0.c(this.f15908g, i10).f27761b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        boolean z10 = this.f15912k;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    b(new y2.b0(0, this.f15908g.f33682a.f27761b.length()));
                    break;
                case R.id.cut:
                    d(277);
                    return false;
                case R.id.copy:
                    d(278);
                    return false;
                case R.id.paste:
                    d(279);
                    return false;
                default:
                    return false;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i10) {
        int i11;
        boolean z10 = this.f15912k;
        if (z10) {
            z10 = true;
            if (i10 != 0) {
                switch (i10) {
                    case 2:
                        i11 = 2;
                        break;
                    case 3:
                        i11 = 3;
                        break;
                    case 4:
                        i11 = 4;
                        break;
                    case 5:
                        i11 = 6;
                        break;
                    case 6:
                        i11 = 7;
                        break;
                    case 7:
                        i11 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i10);
                        i11 = 1;
                        break;
                }
                p1.this.f15889d.invoke(new y2.n(i11));
            } else {
                i11 = 1;
                p1.this.f15889d.invoke(new y2.n(i11));
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x02c2  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, final IntConsumer intConsumer) {
        t2.b bVar;
        long jH;
        int i10;
        int iA;
        l4 l4VarD;
        int iA2;
        l4 l4VarD2;
        t2.g0 g0Var;
        if (Build.VERSION.SDK_INT >= 34) {
            a aVar = new a();
            i2 i2Var = this.f15904c;
            final int iA3 = 3;
            if (i2Var != null && (bVar = i2Var.f13346j) != null) {
                l4 l4VarD3 = i2Var.d();
                if (bVar.equals((l4VarD3 == null || (g0Var = l4VarD3.f13418a.f27819a) == null) ? null : g0Var.f27809a)) {
                    boolean zA = z.a(handwritingGesture);
                    x2 x2Var = this.f15905d;
                    if (zA) {
                        SelectGesture selectGestureA = k0.a(handwritingGesture);
                        long jF = g1.f(i2Var, x1.e(selectGestureA.getSelectionArea()), selectGestureA.getGranularity() == 1 ? 1 : 0);
                        if (t2.j0.b(jF)) {
                            iA3 = e1.a(p0.a(selectGestureA), aVar);
                        } else {
                            aVar.invoke(new y2.b0((int) (jF >> 32), (int) (jF & BodyPartID.bodyIdMax)));
                            if (x2Var != null) {
                                x2Var.f(true);
                            }
                            iA3 = 1;
                        }
                    } else if (t0.a(handwritingGesture)) {
                        DeleteGesture deleteGestureA = v0.a(handwritingGesture);
                        int i11 = deleteGestureA.getGranularity() != 1 ? 0 : 1;
                        long jF2 = g1.f(i2Var, x1.e(deleteGestureA.getDeletionArea()), i11);
                        if (t2.j0.b(jF2)) {
                            iA3 = e1.a(p0.a(deleteGestureA), aVar);
                        } else {
                            e1.b(jF2, bVar, i11 == 1, aVar);
                            iA3 = 1;
                        }
                    } else if (w0.a(handwritingGesture)) {
                        SelectRangeGesture selectRangeGestureA = x0.a(handwritingGesture);
                        long jB = g1.b(i2Var, x1.e(selectRangeGestureA.getSelectionStartArea()), x1.e(selectRangeGestureA.getSelectionEndArea()), selectRangeGestureA.getGranularity() == 1 ? 1 : 0);
                        if (t2.j0.b(jB)) {
                            iA3 = e1.a(p0.a(selectRangeGestureA), aVar);
                        } else {
                            aVar.invoke(new y2.b0((int) (jB >> 32), (int) (jB & BodyPartID.bodyIdMax)));
                            if (x2Var != null) {
                                x2Var.f(true);
                            }
                            iA3 = 1;
                        }
                    } else if (y0.a(handwritingGesture)) {
                        DeleteRangeGesture deleteRangeGestureA = z0.a(handwritingGesture);
                        int i12 = deleteRangeGestureA.getGranularity() != 1 ? 0 : 1;
                        long jB2 = g1.b(i2Var, x1.e(deleteRangeGestureA.getDeletionStartArea()), x1.e(deleteRangeGestureA.getDeletionEndArea()), i12);
                        if (t2.j0.b(jB2)) {
                            iA3 = e1.a(p0.a(deleteRangeGestureA), aVar);
                        } else {
                            e1.b(jB2, bVar, i12 == 1, aVar);
                            iA3 = 1;
                        }
                    } else {
                        boolean zA2 = h0.a(handwritingGesture);
                        k5 k5Var = this.f15906e;
                        if (zA2) {
                            JoinOrSplitGesture joinOrSplitGestureA = i0.a(handwritingGesture);
                            if (k5Var == null || (iA2 = g1.a(i2Var, g1.d(joinOrSplitGestureA.getJoinOrSplitPoint()), k5Var)) == -1 || ((l4VarD2 = i2Var.d()) != null && g1.c(l4VarD2.f13418a, iA2))) {
                                iA3 = e1.a(p0.a(joinOrSplitGestureA), aVar);
                            } else {
                                int iCharCount = iA2;
                                while (iCharCount > 0) {
                                    int iCodePointBefore = Character.codePointBefore(bVar, iCharCount);
                                    if (!g1.h(iCodePointBefore)) {
                                        break;
                                    } else {
                                        iCharCount -= Character.charCount(iCodePointBefore);
                                    }
                                }
                                while (iA2 < bVar.f27761b.length()) {
                                    int iCodePointAt = Character.codePointAt(bVar, iA2);
                                    if (!g1.h(iCodePointAt)) {
                                        break;
                                    } else {
                                        iA2 += Character.charCount(iCodePointAt);
                                    }
                                }
                                long jA = t2.k0.a(iCharCount, iA2);
                                if (t2.j0.b(jA)) {
                                    int i13 = (int) (jA >> 32);
                                    aVar.invoke(new f1(new y2.i[]{new y2.b0(i13, i13), new y2.a(" ", 1)}));
                                } else {
                                    e1.b(jA, bVar, false, aVar);
                                }
                                iA3 = 1;
                            }
                        } else if (d0.a(handwritingGesture)) {
                            InsertGesture insertGestureA = e0.a(handwritingGesture);
                            if (k5Var == null || (iA = g1.a(i2Var, g1.d(insertGestureA.getInsertionPoint()), k5Var)) == -1 || ((l4VarD = i2Var.d()) != null && g1.c(l4VarD.f13418a, iA))) {
                                iA3 = e1.a(p0.a(insertGestureA), aVar);
                            } else {
                                aVar.invoke(new f1(new y2.i[]{new y2.b0(iA, iA), new y2.a(insertGestureA.getTextToInsert(), 1)}));
                                iA3 = 1;
                            }
                        } else if (f0.a(handwritingGesture)) {
                            RemoveSpaceGesture removeSpaceGestureA = g0.a(handwritingGesture);
                            l4 l4VarD4 = i2Var.d();
                            t2.h0 h0Var = l4VarD4 != null ? l4VarD4.f13418a : null;
                            long jD = g1.d(removeSpaceGestureA.getStartPoint());
                            long jD2 = g1.d(removeSpaceGestureA.getEndPoint());
                            g2.v vVarC = i2Var.c();
                            if (h0Var != null) {
                                t2.l lVar = h0Var.f27820b;
                                if (vVarC == null) {
                                    jH = t2.j0.f27837b;
                                } else {
                                    long jY = vVarC.y(jD);
                                    long jY2 = vVarC.y(jD2);
                                    int iE = g1.e(lVar, jY, k5Var);
                                    int iE2 = g1.e(lVar, jY2, k5Var);
                                    if (iE != -1) {
                                        if (iE2 != -1) {
                                            iE = Math.min(iE, iE2);
                                        }
                                        iE2 = iE;
                                    } else if (iE2 == -1) {
                                        jH = t2.j0.f27837b;
                                    }
                                    float fB = (lVar.b(iE2) + lVar.f(iE2)) / 2;
                                    int i14 = (int) (jY >> 32);
                                    int i15 = (int) (jY2 >> 32);
                                    jH = lVar.h(new p1.e(Math.min(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15)), fB - 0.1f, Math.max(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15)), fB + 0.1f), 0, f0.a.f27807a);
                                }
                                if (t2.j0.b(jH)) {
                                    iA3 = e1.a(p0.a(removeSpaceGestureA), aVar);
                                } else {
                                    kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
                                    e0Var.f16324a = -1;
                                    kotlin.jvm.internal.e0 e0Var2 = new kotlin.jvm.internal.e0();
                                    e0Var2.f16324a = -1;
                                    String strF = new mh.k("\\s+").f(new d1(e0Var, e0Var2), bVar.subSequence(t2.j0.e(jH), t2.j0.d(jH)).f27761b);
                                    int i16 = e0Var.f16324a;
                                    if (i16 == -1 || (i10 = e0Var2.f16324a) == -1) {
                                        iA3 = e1.a(p0.a(removeSpaceGestureA), aVar);
                                    } else {
                                        int i17 = (int) (jH >> 32);
                                        String strSubstring = strF.substring(i16, strF.length() - (t2.j0.c(jH) - e0Var2.f16324a));
                                        kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
                                        aVar.invoke(new f1(new y2.i[]{new y2.b0(i17 + i16, i17 + i10), new y2.a(strSubstring, 1)}));
                                        iA3 = 1;
                                    }
                                }
                            }
                        } else {
                            iA3 = 2;
                        }
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new Runnable() { // from class: k0.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        intConsumer.accept(iA3);
                    }
                });
            } else {
                intConsumer.accept(iA3);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f15912k;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        i2 i2Var;
        t2.b bVar;
        t2.g0 g0Var;
        if (Build.VERSION.SDK_INT >= 34 && (i2Var = this.f15904c) != null && (bVar = i2Var.f13346j) != null) {
            l4 l4VarD = i2Var.d();
            if (bVar.equals((l4VarD == null || (g0Var = l4VarD.f13418a.f27819a) == null) ? null : g0Var.f27809a)) {
                boolean zA = z.a(previewableHandwritingGesture);
                final x2 x2Var = this.f15905d;
                if (zA) {
                    SelectGesture selectGestureA = k0.a(previewableHandwritingGesture);
                    if (x2Var != null) {
                        long jF = g1.f(i2Var, x1.e(selectGestureA.getSelectionArea()), selectGestureA.getGranularity() != 1 ? 0 : 1);
                        i2 i2Var2 = x2Var.f17550d;
                        if (i2Var2 != null) {
                            i2Var2.f(jF);
                        }
                        i2 i2Var3 = x2Var.f17550d;
                        if (i2Var3 != null) {
                            i2Var3.e(t2.j0.f27837b);
                        }
                        if (!t2.j0.b(jF)) {
                            x2Var.q(false);
                            x2Var.o(v1.f13646a);
                        }
                    }
                } else if (t0.a(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureA = v0.a(previewableHandwritingGesture);
                    if (x2Var != null) {
                        long jF2 = g1.f(i2Var, x1.e(deleteGestureA.getDeletionArea()), deleteGestureA.getGranularity() != 1 ? 0 : 1);
                        i2 i2Var4 = x2Var.f17550d;
                        if (i2Var4 != null) {
                            i2Var4.e(jF2);
                        }
                        i2 i2Var5 = x2Var.f17550d;
                        if (i2Var5 != null) {
                            i2Var5.f(t2.j0.f27837b);
                        }
                        if (!t2.j0.b(jF2)) {
                            x2Var.q(false);
                            x2Var.o(v1.f13646a);
                        }
                    }
                } else if (w0.a(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureA = x0.a(previewableHandwritingGesture);
                    if (x2Var != null) {
                        long jB = g1.b(i2Var, x1.e(selectRangeGestureA.getSelectionStartArea()), x1.e(selectRangeGestureA.getSelectionEndArea()), selectRangeGestureA.getGranularity() != 1 ? 0 : 1);
                        i2 i2Var6 = x2Var.f17550d;
                        if (i2Var6 != null) {
                            i2Var6.f(jB);
                        }
                        i2 i2Var7 = x2Var.f17550d;
                        if (i2Var7 != null) {
                            i2Var7.e(t2.j0.f27837b);
                        }
                        if (!t2.j0.b(jB)) {
                            x2Var.q(false);
                            x2Var.o(v1.f13646a);
                        }
                    }
                } else if (y0.a(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureA = z0.a(previewableHandwritingGesture);
                    if (x2Var != null) {
                        long jB2 = g1.b(i2Var, x1.e(deleteRangeGestureA.getDeletionStartArea()), x1.e(deleteRangeGestureA.getDeletionEndArea()), deleteRangeGestureA.getGranularity() != 1 ? 0 : 1);
                        i2 i2Var8 = x2Var.f17550d;
                        if (i2Var8 != null) {
                            i2Var8.e(jB2);
                        }
                        i2 i2Var9 = x2Var.f17550d;
                        if (i2Var9 != null) {
                            i2Var9.f(t2.j0.f27837b);
                        }
                        if (!t2.j0.b(jB2)) {
                            x2Var.q(false);
                            x2Var.o(v1.f13646a);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: k0.c1
                        @Override // android.os.CancellationSignal.OnCancelListener
                        public final void onCancel() {
                            x2 x2Var2 = x2Var;
                            if (x2Var2 != null) {
                                i2 i2Var10 = x2Var2.f17550d;
                                if (i2Var10 != null) {
                                    i2Var10.e(t2.j0.f27837b);
                                }
                                i2 i2Var11 = x2Var2.f17550d;
                                if (i2Var11 == null) {
                                    return;
                                }
                                i2Var11.f(t2.j0.f27837b);
                            }
                        }
                    });
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean requestCursorUpdates(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        l1 l1Var;
        boolean z13 = this.f15912k;
        if (!z13) {
            return z13;
        }
        boolean z14 = false;
        boolean z15 = (i10 & 1) != 0;
        boolean z16 = (i10 & 2) != 0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            z11 = (i10 & 16) != 0;
            z12 = (i10 & 8) != 0;
            boolean z17 = (i10 & 4) != 0;
            if (i11 >= 34 && (i10 & 32) != 0) {
                z14 = true;
            }
            if (z11 || z12 || z17 || z14) {
                z10 = z14;
                z14 = z17;
                l1Var = p1.this.f15898m;
                synchronized (l1Var.f15858c) {
                    try {
                        l1Var.f15861f = z11;
                        l1Var.f15862g = z12;
                        l1Var.f15863h = z14;
                        l1Var.f15864i = z10;
                        if (z15) {
                            l1Var.f15860e = true;
                            if (l1Var.f15865j != null) {
                                l1Var.a();
                            }
                        }
                        l1Var.f15859d = z16;
                        pg.f0 f0Var = pg.f0.f21461a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return true;
            }
            if (i11 >= 34) {
                z10 = true;
                z14 = true;
            } else {
                z10 = z14;
                z14 = true;
            }
            z11 = z14;
        } else {
            z10 = false;
            z11 = true;
        }
        z12 = z11;
        l1Var = p1.this.f15898m;
        synchronized (l1Var.f15858c) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, pg.j] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f15912k;
        if (!z10) {
            return z10;
        }
        ((BaseInputConnection) p1.this.f15896k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f15912k;
        if (z10) {
            b(new y2.z(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f15912k;
        if (z10) {
            b(new y2.a0(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        boolean z10 = this.f15912k;
        if (!z10) {
            return z10;
        }
        b(new y2.b0(i10, i11));
        return true;
    }
}
