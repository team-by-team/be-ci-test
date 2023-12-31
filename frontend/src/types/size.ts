export type Size = 'xxs' | 'xs' | 'sm' | 'md' | 'lg' | 'xl' | 'xxl';

export type ButtonSize = Extract<Size, 'sm' | 'md' | 'lg'>;

export type TextSize = Size;
