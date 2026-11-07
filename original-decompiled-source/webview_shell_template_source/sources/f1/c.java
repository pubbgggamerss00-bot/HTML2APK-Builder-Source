package f1;

import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.g;
import androidx.emoji2.text.m;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f12966a;

    /* renamed from: b, reason: collision with root package name */
    public final a f12967b;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
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
        public static boolean a(c cVar, Editable editable, int i6, int i7, boolean z6) {
            int iMin;
            if (editable != null && i6 >= 0 && i7 >= 0) {
                int selectionStart = Selection.getSelectionStart(editable);
                int selectionEnd = Selection.getSelectionEnd(editable);
                if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                    if (z6) {
                        int iMax = Math.max(i6, 0);
                        int length = editable.length();
                        if (selectionStart < 0 || length < selectionStart || iMax < 0) {
                            selectionStart = -1;
                            int iMax2 = Math.max(i7, 0);
                            iMin = editable.length();
                            if (selectionEnd >= 0 || iMin < selectionEnd || iMax2 < 0) {
                                iMin = -1;
                                if (selectionStart != -1 && iMin != -1) {
                                }
                            } else {
                                loop2: while (true) {
                                    boolean z7 = false;
                                    while (true) {
                                        if (iMax2 == 0) {
                                            iMin = selectionEnd;
                                            break loop2;
                                        }
                                        if (selectionEnd >= iMin) {
                                            if (z7) {
                                                break;
                                            }
                                        } else {
                                            char cCharAt = editable.charAt(selectionEnd);
                                            if (z7) {
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
                                                z7 = true;
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
                                boolean z8 = false;
                                while (true) {
                                    if (iMax == 0) {
                                        break loop0;
                                    }
                                    selectionStart--;
                                    if (selectionStart >= 0) {
                                        char cCharAt2 = editable.charAt(selectionStart);
                                        if (z8) {
                                            break;
                                        }
                                        if (!Character.isSurrogate(cCharAt2)) {
                                            iMax--;
                                        } else {
                                            if (Character.isHighSurrogate(cCharAt2)) {
                                                break loop0;
                                            }
                                            z8 = true;
                                        }
                                    } else {
                                        if (z8) {
                                            break loop0;
                                        }
                                        selectionStart = 0;
                                    }
                                }
                                iMax--;
                            }
                            selectionStart = -1;
                            int iMax22 = Math.max(i7, 0);
                            iMin = editable.length();
                            if (selectionEnd >= 0) {
                                iMin = -1;
                                if (selectionStart != -1) {
                                }
                            }
                        }
                    } else {
                        selectionStart = Math.max(selectionStart - i6, 0);
                        iMin = Math.min(selectionEnd + i7, editable.length());
                    }
                    m[] mVarArr = (m[]) editable.getSpans(selectionStart, iMin, m.class);
                    if (mVarArr != null && mVarArr.length > 0) {
                        for (m mVar : mVarArr) {
                            int spanStart = editable.getSpanStart(mVar);
                            int spanEnd = editable.getSpanEnd(mVar);
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

    public c(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        a aVar = new a();
        super(inputConnection, false);
        this.f12966a = editText;
        this.f12967b = aVar;
        if (androidx.emoji2.text.g.f991k != null) {
            androidx.emoji2.text.g gVarA = androidx.emoji2.text.g.a();
            if (gVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            g.a aVar2 = gVarA.f996e;
            aVar2.getClass();
            Bundle bundle = editorInfo.extras;
            e1.b bVar = aVar2.f1001c.f1035a;
            int iA = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar.f12778d).getInt(iA + bVar.f12775a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i6, int i7) {
        Editable editableText = this.f12966a.getEditableText();
        this.f12967b.getClass();
        return a.a(this, editableText, i6, i7, false) || super.deleteSurroundingText(i6, i7);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i6, int i7) {
        Editable editableText = this.f12966a.getEditableText();
        this.f12967b.getClass();
        return a.a(this, editableText, i6, i7, true) || super.deleteSurroundingTextInCodePoints(i6, i7);
    }
}
