package org.jf.dexlib2.dexbacked.util;

import java.util.List;
import java.util.Set;
import nc.r;
import nc.u0;
import nc.v;
import nc.w0;
import org.jf.dexlib2.dexbacked.DexBackedAnnotation;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;

/* loaded from: classes3.dex */
public abstract class AnnotationsDirectory {
    public static final AnnotationsDirectory EMPTY = new AnnotationsDirectory() { // from class: org.jf.dexlib2.dexbacked.util.AnnotationsDirectory.1
        @Override // org.jf.dexlib2.dexbacked.util.AnnotationsDirectory
        public Set<? extends DexBackedAnnotation> getClassAnnotations() {
            int i10 = v.f18759c;
            return w0.f18781j;
        }

        @Override // org.jf.dexlib2.dexbacked.util.AnnotationsDirectory
        public int getFieldAnnotationCount() {
            return 0;
        }

        @Override // org.jf.dexlib2.dexbacked.util.AnnotationsDirectory
        public AnnotationIterator getFieldAnnotationIterator() {
            return AnnotationIterator.EMPTY;
        }

        @Override // org.jf.dexlib2.dexbacked.util.AnnotationsDirectory
        public AnnotationIterator getMethodAnnotationIterator() {
            return AnnotationIterator.EMPTY;
        }

        @Override // org.jf.dexlib2.dexbacked.util.AnnotationsDirectory
        public AnnotationIterator getParameterAnnotationIterator() {
            return AnnotationIterator.EMPTY;
        }
    };

    public interface AnnotationIterator {
        public static final AnnotationIterator EMPTY = new AnnotationIterator() { // from class: org.jf.dexlib2.dexbacked.util.AnnotationsDirectory.AnnotationIterator.1
            @Override // org.jf.dexlib2.dexbacked.util.AnnotationsDirectory.AnnotationIterator
            public void reset() {
            }

            @Override // org.jf.dexlib2.dexbacked.util.AnnotationsDirectory.AnnotationIterator
            public int seekTo(int i10) {
                return 0;
            }
        };

        void reset();

        int seekTo(int i10);
    }

    public static class AnnotationsDirectoryImpl extends AnnotationsDirectory {
        private static final int ANNOTATIONS_START_OFFSET = 16;
        private static final int FIELD_ANNOTATION_SIZE = 8;
        private static final int FIELD_COUNT_OFFSET = 4;
        private static final int METHOD_ANNOTATION_SIZE = 8;
        private static final int METHOD_COUNT_OFFSET = 8;
        private static final int PARAMETER_COUNT_OFFSET = 12;
        public final DexBackedDexFile dexFile;
        private final int directoryOffset;

        public class AnnotationIteratorImpl implements AnnotationIterator {
            private int currentIndex = 0;
            private int currentItemIndex;
            private final int size;
            private final int startOffset;

            public AnnotationIteratorImpl(int i10, int i11) {
                this.startOffset = i10;
                this.size = i11;
                this.currentItemIndex = AnnotationsDirectoryImpl.this.dexFile.getDataBuffer().readSmallUint(i10);
            }

            @Override // org.jf.dexlib2.dexbacked.util.AnnotationsDirectory.AnnotationIterator
            public void reset() {
                this.currentItemIndex = AnnotationsDirectoryImpl.this.dexFile.getDataBuffer().readSmallUint(this.startOffset);
                this.currentIndex = 0;
            }

            @Override // org.jf.dexlib2.dexbacked.util.AnnotationsDirectory.AnnotationIterator
            public int seekTo(int i10) {
                int i11;
                while (true) {
                    i11 = this.currentItemIndex;
                    if (i11 >= i10) {
                        break;
                    }
                    int i12 = this.currentIndex;
                    if (i12 + 1 >= this.size) {
                        break;
                    }
                    this.currentIndex = i12 + 1;
                    this.currentItemIndex = AnnotationsDirectoryImpl.this.dexFile.getDataBuffer().readSmallUint((this.currentIndex * 8) + this.startOffset);
                }
                if (i11 != i10) {
                    return 0;
                }
                return AnnotationsDirectoryImpl.this.dexFile.getDataBuffer().readSmallUint((this.currentIndex * 8) + this.startOffset + 4);
            }
        }

        public AnnotationsDirectoryImpl(DexBackedDexFile dexBackedDexFile, int i10) {
            this.dexFile = dexBackedDexFile;
            this.directoryOffset = i10;
        }

        @Override // org.jf.dexlib2.dexbacked.util.AnnotationsDirectory
        public Set<? extends DexBackedAnnotation> getClassAnnotations() {
            DexBackedDexFile dexBackedDexFile = this.dexFile;
            return AnnotationsDirectory.getAnnotations(dexBackedDexFile, dexBackedDexFile.getDataBuffer().readSmallUint(this.directoryOffset));
        }

        @Override // org.jf.dexlib2.dexbacked.util.AnnotationsDirectory
        public int getFieldAnnotationCount() {
            return this.dexFile.getDataBuffer().readSmallUint(this.directoryOffset + 4);
        }

        @Override // org.jf.dexlib2.dexbacked.util.AnnotationsDirectory
        public AnnotationIterator getFieldAnnotationIterator() {
            int fieldAnnotationCount = getFieldAnnotationCount();
            return fieldAnnotationCount == 0 ? AnnotationIterator.EMPTY : new AnnotationIteratorImpl(this.directoryOffset + 16, fieldAnnotationCount);
        }

        public int getMethodAnnotationCount() {
            return this.dexFile.getDataBuffer().readSmallUint(this.directoryOffset + 8);
        }

        @Override // org.jf.dexlib2.dexbacked.util.AnnotationsDirectory
        public AnnotationIterator getMethodAnnotationIterator() {
            int methodAnnotationCount = getMethodAnnotationCount();
            if (methodAnnotationCount == 0) {
                return AnnotationIterator.EMPTY;
            }
            return new AnnotationIteratorImpl((getFieldAnnotationCount() * 8) + this.directoryOffset + 16, methodAnnotationCount);
        }

        public int getParameterAnnotationCount() {
            return this.dexFile.getDataBuffer().readSmallUint(this.directoryOffset + 12);
        }

        @Override // org.jf.dexlib2.dexbacked.util.AnnotationsDirectory
        public AnnotationIterator getParameterAnnotationIterator() {
            int parameterAnnotationCount = getParameterAnnotationCount();
            if (parameterAnnotationCount == 0) {
                return AnnotationIterator.EMPTY;
            }
            int fieldAnnotationCount = getFieldAnnotationCount();
            int i10 = fieldAnnotationCount * 8;
            return new AnnotationIteratorImpl((getMethodAnnotationCount() * 8) + i10 + this.directoryOffset + 16, parameterAnnotationCount);
        }
    }

    public static Set<? extends DexBackedAnnotation> getAnnotations(final DexBackedDexFile dexBackedDexFile, final int i10) {
        if (i10 != 0) {
            final int smallUint = dexBackedDexFile.getDataBuffer().readSmallUint(i10);
            return new FixedSizeSet<DexBackedAnnotation>() { // from class: org.jf.dexlib2.dexbacked.util.AnnotationsDirectory.2
                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return smallUint;
                }

                @Override // org.jf.dexlib2.dexbacked.util.FixedSizeSet
                public DexBackedAnnotation readItem(int i11) {
                    return new DexBackedAnnotation(dexBackedDexFile, dexBackedDexFile.getDataBuffer().readSmallUint((i11 * 4) + i10 + 4));
                }
            };
        }
        int i11 = v.f18759c;
        return w0.f18781j;
    }

    public static List<Set<? extends DexBackedAnnotation>> getParameterAnnotations(final DexBackedDexFile dexBackedDexFile, final int i10) {
        if (i10 > 0) {
            final int smallUint = dexBackedDexFile.getDataBuffer().readSmallUint(i10);
            return new FixedSizeList<Set<? extends DexBackedAnnotation>>() { // from class: org.jf.dexlib2.dexbacked.util.AnnotationsDirectory.3
                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return smallUint;
                }

                @Override // org.jf.dexlib2.dexbacked.util.FixedSizeList
                public Set<? extends DexBackedAnnotation> readItem(int i11) {
                    return AnnotationsDirectory.getAnnotations(dexBackedDexFile, dexBackedDexFile.getDataBuffer().readSmallUint((i11 * 4) + i10 + 4));
                }
            };
        }
        r.a aVar = r.f18735b;
        return u0.f18756e;
    }

    public static AnnotationsDirectory newOrEmpty(DexBackedDexFile dexBackedDexFile, int i10) {
        return i10 == 0 ? EMPTY : new AnnotationsDirectoryImpl(dexBackedDexFile, i10);
    }

    public abstract Set<? extends DexBackedAnnotation> getClassAnnotations();

    public abstract int getFieldAnnotationCount();

    public abstract AnnotationIterator getFieldAnnotationIterator();

    public abstract AnnotationIterator getMethodAnnotationIterator();

    public abstract AnnotationIterator getParameterAnnotationIterator();
}
