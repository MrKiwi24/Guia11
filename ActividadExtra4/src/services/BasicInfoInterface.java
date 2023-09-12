package services;

import entities.BasicInfo;

public interface BasicInfoInterface {
    public BasicInfo register();
    public void fetchBasicInfo(BasicInfo info);
    public BasicInfo update(BasicInfo oldInfo);
    public BasicInfo delete(BasicInfo info);
}
