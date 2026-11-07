package z4;

import android.text.Editable;
import android.text.Selection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final m.c f34750a;

    /* renamed from: b, reason: collision with root package name */
    public final a f34751b;

    public static class a {
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
        
            if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
        
            if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
         */
        /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static boolean a(c cVar, Editable editable, int i10, int i11, boolean z10) {
            int iMin;
            if (editable != null && i10 >= 0 && i11 >= 0) {
                int selectionStart = Selection.getSelectionStart(editable);
                int selectionEnd = Selection.getSelectionEnd(editable);
                if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                    if (z10) {
                        int iMax = Math.max(i10, 0);
                        int length = editable.length();
                        if (selectionStart < 0 || length < selectionStart || iMax < 0) {
                            selectionStart = -1;
                            int iMax2 = Math.max(i11, 0);
                            iMin = editable.length();
                            if (selectionEnd >= 0 || iMin < selectionEnd || iMax2 < 0) {
                                iMin = -1;
                                if (selectionStart != -1 && iMin != -1) {
                                }
                            } else {
                                loop2: while (true) {
                                    boolean z11 = false;
                                    while (true) {
                                        if (iMax2 == 0) {
                                            iMin = selectionEnd;
                                            break loop2;
                                        }
                                        if (selectionEnd >= iMin) {
                                            if (z11) {
                                                break;
                                            }
                                        } else {
                                            char cCharAt = editable.charAt(selectionEnd);
                                            if (z11) {
                                                break;
                                            }
                                            if (!Character.isSurrogate(cCharAt)) {
                                                iMax2--;
                                                selectionEnd++;
                                            } else {
                                                if (Character.isLowSurrogate(cCharAt)) {
                                                    break loop2;
                                                }
                                                selectionEnd++;
                                                z11 = true;
                                            }
                                        }
                                    }
                                    iMax2--;
                                    selectionEnd++;
                                }
                                iMin = -1;
                                if (selectionStart != -1) {
                                }
                            }
                        } else {
                            loop0: while (true) {
                                boolean z12 = false;
                                while (true) {
                                    if (iMax == 0) {
                                        break loop0;
                                    }
                                    selectionStart--;
                                    if (selectionStart >= 0) {
                                        char cCharAt2 = editable.charAt(selectionStart);
                                        if (z12) {
                                            break;
                                        }
                                        if (!Character.isSurrogate(cCharAt2)) {
                                            iMax--;
                                        } else {
                                            if (Character.isHighSurrogate(cCharAt2)) {
                                                break loop0;
                                            }
                                            z12 = true;
                                        }
                                    } else {
                                        if (z12) {
                                            break loop0;
                                        }
                                        selectionStart = 0;
                                    }
                                }
                                iMax--;
                            }
                            selectionStart = -1;
                            int iMax22 = Math.max(i11, 0);
                            iMin = editable.length();
                            if (selectionEnd >= 0) {
                                iMin = -1;
                                if (selectionStart != -1) {
                                }
                            }
                        }
                    } else {
                        selectionStart = Math.max(selectionStart - i10, 0);
                        iMin = Math.min(selectionEnd + i11, editable.length());
                    }
                    x4.g[] gVarArr = (x4.g[]) editable.getSpans(selectionStart, iMin, x4.g.class);
                    if (gVarArr != null && gVarArr.length > 0) {
                        for (x4.g gVar : gVarArr) {
                            int spanStart = editable.getSpanStart(gVar);
                            int spanEnd = editable.getSpanEnd(gVar);
                            selectionStart = Math.min(spanStart, selectionStart);
                            iMin = Math.max(spanEnd, iMin);
                        }
                        int iMax3 = Math.max(selectionStart, 0);
                        int iMin2 = Math.min(iMin, editable.length());
                        cVar.beginBatchEdit();
                        editable.delete(iMax3, iMin2);
                        cVar.endBatchEdit();
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public c(m.c cVar, InputConnection inputConnection, EditorInfo editorInfo) {
        a aVar = new a();
        super(inputConnection, false);
        this.f34750a = cVar;
        this.f34751b = aVar;
        if (androidx.emoji2.text.d.d()) {
            androidx.emoji2.text.d.a().i(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        Editable editableText = this.f34750a.getEditableText();
        this.f34751b.getClass();
        return a.a(this, editableText, i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        Editable editableText = this.f34750a.getEditableText();
        this.f34751b.getClass();
        return a.a(this, editableText, i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }
}
