package z4;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final b f34758a;

    public static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f34759a;

        /* renamed from: b, reason: collision with root package name */
        public final d f34760b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f34761c = true;

        public a(TextView textView) {
            this.f34759a = textView;
            this.f34760b = new d(textView);
        }

        @Override // z4.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f34761c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                    InputFilter inputFilter = inputFilterArr[i10];
                    if (inputFilter instanceof d) {
                        sparseArray.put(i10, inputFilter);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    if (sparseArray.indexOfKey(i12) < 0) {
                        inputFilterArr2[i11] = inputFilterArr[i12];
                        i11++;
                    }
                }
                return inputFilterArr2;
            }
            int length2 = inputFilterArr.length;
            int i13 = 0;
            while (true) {
                d dVar = this.f34760b;
                if (i13 >= length2) {
                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = dVar;
                    return inputFilterArr3;
                }
                if (inputFilterArr[i13] == dVar) {
                    return inputFilterArr;
                }
                i13++;
            }
        }

        @Override // z4.f.b
        public final boolean b() {
            return this.f34761c;
        }

        @Override // z4.f.b
        public final void c(boolean z10) {
            if (z10) {
                e();
            }
        }

        @Override // z4.f.b
        public final void d(boolean z10) {
            this.f34761c = z10;
            e();
            TextView textView = this.f34759a;
            textView.setFilters(a(textView.getFilters()));
        }

        public final void e() {
            TextView textView = this.f34759a;
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (this.f34761c) {
                if (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                    transformationMethod = new h(transformationMethod);
                }
            } else if (transformationMethod instanceof h) {
                transformationMethod = ((h) transformationMethod).f34767a;
            }
            textView.setTransformationMethod(transformationMethod);
        }
    }

    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void c(boolean z10) {
            throw null;
        }

        public void d(boolean z10) {
            throw null;
        }
    }

    public static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final a f34762a;

        public c(TextView textView) {
            this.f34762a = new a(textView);
        }

        @Override // z4.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            return !androidx.emoji2.text.d.d() ? inputFilterArr : this.f34762a.a(inputFilterArr);
        }

        @Override // z4.f.b
        public final boolean b() {
            return this.f34762a.f34761c;
        }

        @Override // z4.f.b
        public final void c(boolean z10) {
            if (androidx.emoji2.text.d.d()) {
                this.f34762a.c(z10);
            }
        }

        @Override // z4.f.b
        public final void d(boolean z10) {
            boolean zD = androidx.emoji2.text.d.d();
            a aVar = this.f34762a;
            if (zD) {
                aVar.d(z10);
            } else {
                aVar.f34761c = z10;
            }
        }
    }

    public f(TextView textView) {
        this.f34758a = new c(textView);
    }
}
