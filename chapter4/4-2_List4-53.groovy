assert 'hello'.tr('aiueo','AIUEO') == 'hEllO'
assert '������������'.tr('��-��','a-z') == 'abcdef'

//tr()�ɂ��ꊇ�ϊ�