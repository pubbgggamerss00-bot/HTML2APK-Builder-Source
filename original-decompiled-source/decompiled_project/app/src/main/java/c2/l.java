package c2;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public long f4667a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseLongArray f4668b = new SparseLongArray();

    /* renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f4669c = new SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4670d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f4671e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f4672f = -1;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d0 a(MotionEvent motionEvent, AndroidComposeView androidComposeView) {
        long j10;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        long jValueAt;
        float f10;
        long j11;
        long jA;
        long jY;
        int toolType;
        int i12;
        int historySize;
        int i13;
        long j12;
        long jFloatToRawIntBits;
        int i14;
        AndroidComposeView androidComposeView2 = androidComposeView;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f4668b;
        SparseBooleanArray sparseBooleanArray = this.f4669c;
        int i15 = 3;
        if (actionMasked != 3) {
            int i16 = 4;
            if (actionMasked != 4) {
                if (motionEvent.getPointerCount() == 1) {
                    int toolType2 = motionEvent.getToolType(0);
                    int source = motionEvent.getSource();
                    if (toolType2 != this.f4671e || source != this.f4672f) {
                        this.f4671e = toolType2;
                        this.f4672f = source;
                        sparseBooleanArray.clear();
                        sparseLongArray.clear();
                    }
                }
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0 || actionMasked2 == 5) {
                    j10 = 1;
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    if (sparseLongArray.indexOfKey(pointerId) < 0) {
                        long j13 = this.f4667a;
                        this.f4667a = j13 + 1;
                        sparseLongArray.put(pointerId, j13);
                        if (motionEvent.getToolType(actionIndex) == 3) {
                            sparseBooleanArray.put(pointerId, true);
                        }
                    }
                } else if (actionMasked2 != 9) {
                    j10 = 1;
                } else {
                    int pointerId2 = motionEvent.getPointerId(0);
                    if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                        long j14 = this.f4667a;
                        j10 = 1;
                        this.f4667a = j14 + 1;
                        sparseLongArray.put(pointerId2, j14);
                    }
                }
                boolean z12 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
                boolean z13 = actionMasked == 8;
                if (z12) {
                    i10 = 1;
                    sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
                } else {
                    i10 = 1;
                }
                int actionIndex2 = actionMasked != i10 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
                ArrayList arrayList = this.f4670d;
                arrayList.clear();
                int pointerCount = motionEvent.getPointerCount();
                int i17 = 0;
                while (i17 < pointerCount) {
                    boolean z14 = (z12 || i17 == actionIndex2 || (z13 && motionEvent.getButtonState() == 0)) ? false : true;
                    int pointerId3 = motionEvent.getPointerId(i17);
                    int iIndexOfKey = sparseLongArray.indexOfKey(pointerId3);
                    if (iIndexOfKey >= 0) {
                        z11 = z12;
                        z10 = z13;
                        jValueAt = sparseLongArray.valueAt(iIndexOfKey);
                    } else {
                        z10 = z13;
                        long j15 = this.f4667a;
                        z11 = z12;
                        this.f4667a = j15 + j10;
                        sparseLongArray.put(pointerId3, j15);
                        jValueAt = j15;
                    }
                    float pressure = motionEvent.getPressure(i17);
                    char c10 = ' ';
                    long jFloatToRawIntBits2 = (Float.floatToRawIntBits(motionEvent.getY(i17)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(motionEvent.getX(i17)) << 32);
                    long jA2 = p1.c.a(jFloatToRawIntBits2, CropImageView.DEFAULT_ASPECT_RATIO, i15);
                    if (i17 == 0) {
                        f10 = 0.0f;
                        jA = (Float.floatToRawIntBits(motionEvent.getRawY()) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(motionEvent.getRawX()) << 32);
                        jY = androidComposeView2.y(jA);
                    } else {
                        f10 = 0.0f;
                        if (Build.VERSION.SDK_INT >= 29) {
                            jA = (Float.floatToRawIntBits(motionEvent.getRawY(i17)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(motionEvent.getRawX(i17)) << 32);
                            jY = androidComposeView2.y(jA);
                        } else {
                            j11 = jFloatToRawIntBits2;
                            jA = androidComposeView2.A(jFloatToRawIntBits2);
                            toolType = motionEvent.getToolType(i17);
                            if (toolType == 0) {
                                i12 = 0;
                            } else if (toolType == 1) {
                                i12 = 1;
                            } else if (toolType == 2) {
                                i12 = i15;
                            } else if (toolType == i15) {
                                i12 = 2;
                            } else if (toolType == i16) {
                                i12 = i16;
                            }
                            ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                            historySize = motionEvent.getHistorySize();
                            i13 = 0;
                            while (i13 < historySize) {
                                float historicalX = motionEvent.getHistoricalX(i17, i13);
                                float historicalY = motionEvent.getHistoricalY(i17, i13);
                                char c11 = c10;
                                if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                                    i14 = actionIndex2;
                                } else {
                                    i14 = actionIndex2;
                                    long jFloatToRawIntBits3 = (Float.floatToRawIntBits(historicalX) << c11) | (Float.floatToRawIntBits(historicalY) & BodyPartID.bodyIdMax);
                                    arrayList2.add(new e(motionEvent.getHistoricalEventTime(i13), jFloatToRawIntBits3, jFloatToRawIntBits3));
                                }
                                i13++;
                                actionIndex2 = i14;
                                c10 = c11;
                            }
                            char c12 = c10;
                            int i18 = actionIndex2;
                            if (motionEvent.getActionMasked() != 8) {
                                float axisValue = motionEvent.getAxisValue(10);
                                float f11 = (-motionEvent.getAxisValue(9)) + f10;
                                j12 = jA;
                                jFloatToRawIntBits = (Float.floatToRawIntBits(axisValue) << c12) | (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax);
                            } else {
                                j12 = jA;
                                jFloatToRawIntBits = 0;
                            }
                            arrayList.add(new e0(jValueAt, motionEvent.getEventTime(), j12, j11, z14, pressure, i12, sparseBooleanArray.get(motionEvent.getPointerId(i17), false), arrayList2, jFloatToRawIntBits, jA2));
                            i17++;
                            androidComposeView2 = androidComposeView;
                            actionIndex2 = i18;
                            z13 = z10;
                            z12 = z11;
                            i15 = 3;
                            i16 = 4;
                        }
                    }
                    j11 = jY;
                    toolType = motionEvent.getToolType(i17);
                    if (toolType == 0) {
                    }
                    ArrayList arrayList22 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    i13 = 0;
                    while (i13 < historySize) {
                    }
                    char c122 = c10;
                    int i182 = actionIndex2;
                    if (motionEvent.getActionMasked() != 8) {
                    }
                    arrayList.add(new e0(jValueAt, motionEvent.getEventTime(), j12, j11, z14, pressure, i12, sparseBooleanArray.get(motionEvent.getPointerId(i17), false), arrayList22, jFloatToRawIntBits, jA2));
                    i17++;
                    androidComposeView2 = androidComposeView;
                    actionIndex2 = i182;
                    z13 = z10;
                    z12 = z11;
                    i15 = 3;
                    i16 = 4;
                }
                int actionMasked3 = motionEvent.getActionMasked();
                if (actionMasked3 == 1 || actionMasked3 == 6) {
                    int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    i11 = 0;
                    if (!sparseBooleanArray.get(pointerId4, false)) {
                        sparseLongArray.delete(pointerId4);
                        sparseBooleanArray.delete(pointerId4);
                    }
                } else {
                    i11 = 0;
                }
                if (sparseLongArray.size() > motionEvent.getPointerCount()) {
                    for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                        int iKeyAt = sparseLongArray.keyAt(size);
                        int pointerCount2 = motionEvent.getPointerCount();
                        int i19 = i11;
                        while (true) {
                            if (i19 >= pointerCount2) {
                                sparseLongArray.removeAt(size);
                                sparseBooleanArray.delete(iKeyAt);
                                break;
                            }
                            if (motionEvent.getPointerId(i19) == iKeyAt) {
                                break;
                            }
                            i19++;
                        }
                    }
                }
                motionEvent.getEventTime();
                return new d0(arrayList, motionEvent);
            }
        }
        sparseLongArray.clear();
        sparseBooleanArray.clear();
        return null;
    }
}
